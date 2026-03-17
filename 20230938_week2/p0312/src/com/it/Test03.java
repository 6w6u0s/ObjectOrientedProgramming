package com.it;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input은 타입이 scanner인 변수임.
		//new Scanner(System.in) 은 scanner의 객체를 생성
		
		
		int x;
		int y;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		x = input.nextInt();
		//사용자로부터 정수를 받음 Int
		System.out.print("두번째 숫자를 입력하시오: ");
		y = input.nextInt();
		
		sum = x+y;
		
		System.out.println(sum);
		

	}

}
