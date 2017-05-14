package com.lzs.thread;

import java.util.concurrent.TimeUnit;

public class LoginServlet {
	private static String usernameref;
	private static String passwordref;

	synchronized public static void doPost(String username, String password) {
		try {
			usernameref = username;
			if ("a".equals(username)) {
				TimeUnit.SECONDS.sleep(5);
			}
			passwordref = password;
			System.out.println("username=" + usernameref + " password=" + passwordref);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
