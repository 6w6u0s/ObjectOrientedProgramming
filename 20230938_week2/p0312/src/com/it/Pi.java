package com.it;
import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double x;
		double sum;
		
		System.out.print("반지름을 입력하시오: ");
		x = input.nextDouble();
		
		sum = x * x * 3.14;

		System.out.println(sum);
		

	}

}
