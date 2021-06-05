package com.minhow.observer.pattern;

/**
 * @author : MinHow
 * 观察者模式
 */
public class ObserverPatternApplication {

	public static void main(String[] args) {
		MHObserver mhObserver = new MHObserver();

		new ObserverFirst(mhObserver);
		new ObserverSecond(mhObserver);

		mhObserver.setMsg("Hello MinHow~");
		mhObserver.setMsg("Bye MinHow~");
	}

}
