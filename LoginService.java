package com.in28minutes.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		System.out.println("My name is Sheela , Sheela ki jawani");
		return user.equalsIgnoreCase("in28Minutes") && password.equals("dummy");
		
	}

}