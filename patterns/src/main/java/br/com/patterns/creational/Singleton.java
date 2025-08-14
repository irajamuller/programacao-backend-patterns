package br.com.patterns.creational;

import java.util.concurrent.atomic.AtomicInteger;

public class Singleton {
	private volatile static AtomicInteger instance;

	private Singleton() {}

	public static AtomicInteger getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new AtomicInteger(0);
				}
			}
		}
		return instance;
	}

	public static Integer increment() {
		return getInstance().incrementAndGet();
	}
}
