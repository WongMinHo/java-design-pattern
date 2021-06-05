package com.minhow.interpreter.pattern;


import java.util.ArrayList;
import java.util.List;
/**
 * @author : MinHow
 * 解释器模式
 */
public class InterpreterPatternApplication {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> abstractExpressionList = new ArrayList<AbstractExpression>();

        abstractExpressionList.add(new TerminalExpression());
        abstractExpressionList.add(new NonTerminalExpression());
        abstractExpressionList.add(new TerminalExpression());
        abstractExpressionList.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : abstractExpressionList) {
            abstractExpression.Interpret(context);
        }
    }

}
