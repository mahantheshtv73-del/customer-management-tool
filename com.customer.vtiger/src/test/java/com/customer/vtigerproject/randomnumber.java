package com.customer.vtigerproject;

import java.util.Random;

public class randomnumber {
public static void main(String[] args) {
	Random r = new Random();
	int number = r.nextInt(100);
	System.err.println(number);
}
}
