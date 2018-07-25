package com.mryang.singleton;

public class Singleton4 {
	@SuppressWarnings("unused")
	private static class SingletonHolder {
		private static final SingletonHolder INSTANCE = new SingletonHolder();

		private SingletonHolder() {
		}

		public static final SingletonHolder getInstance() {
			return SingletonHolder.INSTANCE;
		}
	}
}
