package com.it;
import java.util.Scanner;

public class Walgup {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int sum;
		
		System.out.print("월급을 입력하시오(숫자만): ");
		x = input.nextInt();
		
		
		sum = x * 12 * 10;
		
		System.out.println("10년 동안의 저축액: " + sum);
		

	}

}
