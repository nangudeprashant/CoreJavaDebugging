package com.itaspirants;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
	int variableForWatchPoint;
	ClassToDebug classToDebugObject;
	static int staticVariable = 30;

	public App() {
		super();
		classToDebugObject = new ClassToDebug();
	}

	public void methodToDebug() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	void callClassToDebugMethod() {
		classToDebugObject.displayNum();
	}

	void methodThrowingException() {
		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void methodForVariableToDebug() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(++this.variableForWatchPoint);
		}
	}

	public static void main(String[] args) {
		App obj = new App();
	    //obj.methodThrowingException();
		obj.methodForVariableToDebug();
	}
}
