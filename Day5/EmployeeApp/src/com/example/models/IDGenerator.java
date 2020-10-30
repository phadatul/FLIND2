package com.example.models;

public class IDGenerator {
	private static int current = 0;
	
	public static int generateUniqueId() {
		return current++;
	}
}
