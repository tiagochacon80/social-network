package application;

import entities.User;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Video v[] = new Video[5];
		v[0] = new Video("OOP class 1");
		v[1] = new Video("PHP class 2");
		v[2] = new Video("HTML5 Class 10");		
		
		User u[] = new User[2];
		u[0] = new User("Tiago", 41, "M", "chaconT19");
		u[1] = new User("Alexia", 12, "F", "lelexie");

		System.out.println(v[0].toString());
		System.out.println(u[0].toString());
	}

}
