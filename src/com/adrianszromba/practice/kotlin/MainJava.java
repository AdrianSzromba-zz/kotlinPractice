package com.adrianszromba.practice.kotlin;

public class MainJava {
	public static void main(String[] args) {

		PointS p1 = new PointS(1,2);
		System.out.println(p1.getX()); // Kotlin create getter
		System.out.println(p1.getY());

		PointSJava p2 = new PointSJava(3,4);
		System.out.println(p2.getX()); // classic Java
		System.out.println(p2.getY());
	}
}
