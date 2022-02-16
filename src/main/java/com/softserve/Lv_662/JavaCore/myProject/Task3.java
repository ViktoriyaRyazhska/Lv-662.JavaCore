package com.softserve.Lv_662.JavaCore.myProject;

public class Task3 {

	public static double canBuy() {
		double dollar = 1;
		double gryvnya = dollar * 28.10;
		double sum = 3850;
		return sum / gryvnya;
	}

	public static void main(String[] args) {

		System.out.println(canBuy());

	}

}
