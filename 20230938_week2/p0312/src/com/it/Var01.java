package com.it;

import java.util.Scanner;

public class Var01 {

	public static void main(String[] args) {
		
		/*int index = 0;
		
		index = index + 1;
		
		System.out.println("index : " + index);
		*/
		
		//변수 선언
		double radius, area;
		//원의 둘레 구하는 변수
		double cir;
		
		//입력받는 클래스를 활용한 변수
		Scanner input = new Scanner(System.in);
		System.out.print("반지름 입력하기 : ");
		//변수 초기화
		radius = input.nextDouble();
		area = 3.141592*radius*radius;
		cir = 3.141592*radius*2;
		
		System.out.println("원의 면적 " + area);
		System.out.println("윈의 둘레 " + cir);
	}

}
