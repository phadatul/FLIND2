package two;

import one.Person;

public class PracticeInDifferentPackage extends Person {

	public static void main(String[] args) {
		//one.Person p=new one.Person();
		//Person p=new Person();
	
		PracticeInDifferentPackage different=new PracticeInDifferentPackage();
		different.c=9;
		
	}
}
