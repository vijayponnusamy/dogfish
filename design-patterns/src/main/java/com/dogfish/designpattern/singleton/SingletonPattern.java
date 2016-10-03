package com.dogfish.designpattern.singleton;
/**
 * Singleton Design Pattern -  This class will demonstrate the Singleton design pattern.
 * How a singleton bean is defined and created.
 *  
 * @author viponnusamy
 *
 */
public class SingletonPattern {

	private static SingletonPattern mInstance;
	
	// Making construct as private
	private SingletonPattern(){
		
	}
	
	//exposing a way to create a object (Initialize on first request)
	public static SingletonPattern getInstance(){
		if(mInstance == null){
			synchronized (SingletonPattern.class) {
				mInstance = new SingletonPattern();
			}
		}
		return mInstance;
	}
	
	public void sayHello(String name){
		System.out.println("Hello "+name);
	}
}
