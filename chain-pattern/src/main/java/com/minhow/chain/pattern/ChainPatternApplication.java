package com.minhow.chain.pattern;

/**
 * @author : MinHow
 * 责任链模式
 */
public class ChainPatternApplication {

    private static AbstractLogger getChainOfLoggers() {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger abstractLogger = getChainOfLoggers();
        abstractLogger.logMessage(AbstractLogger.INFO, "This is INFO information");
        abstractLogger.logMessage(AbstractLogger.DEBUG, "This is DEBUG information");
        abstractLogger.logMessage(AbstractLogger.ERROR, "This is ERROR information");
    }

}
