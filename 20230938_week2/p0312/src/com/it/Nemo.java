package com.it;
import java.util.Scanner;

public class Nemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double w;
		double h;
		double sum1;
		double sum2;
		
		System.out.print("가로를 입력하시오: ");
		w = input.nextDouble();
		System.out.print("세로를 입력하시오: ");
		h = input.nextDouble();
		
		sum1 = w*h;
		sum2 = 2*(w+h);
		
		System.out.println("사각형의 넓이: " + sum1);
		System.out.println("사각형의 둘레: " + sum2);
		

	}

}
