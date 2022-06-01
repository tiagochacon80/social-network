package application;

import entities.Video;

public class Program {

	public static void main(String[] args) {
		Video v[] = new Video[5];
		v[0] = new Video("OOP class 1");
		v[1] = new Video("PHP class 2");
		v[2] = new Video("HTML5 Class 10");				

		System.out.println(v[0].toString());
	}

}
