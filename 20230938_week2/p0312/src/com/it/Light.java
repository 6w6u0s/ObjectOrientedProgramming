package com.it;

public class Light {

	public static void main(String[] args) {
		long lightspeed;
		long distance;
		// long (8바이트) 자료형 int쓰면 짧아서 에러남
		lightspeed = 300000;
		distance = lightspeed * 365L * 24 * 60 * 60;
		
		System.out.println
		("빛이 1년 동안 가는 거리 : " + distance + " km.");

	}

}
