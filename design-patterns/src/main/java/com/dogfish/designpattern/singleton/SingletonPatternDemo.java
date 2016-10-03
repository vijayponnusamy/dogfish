package com.dogfish.designpattern.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		SingletonPattern singletonPattern = SingletonPattern.getInstance();
		singletonPattern.sayHello("John Peter");

	}

}
