package uk.warley.ganesh.chapter7.methodsandencapsulation;

import uk.warley.ganesh.pkg1.Classroom;

public class AccessModifiersNSpecifiers {

}

class School {

	static void test() {
//		System.out.println(Classroom.globalKey);
		Classroom classroom;// can access classroom as it is public
//		Classroom classroom = new Classroom(101, "MR Ganesh");// but can't access Classroom() constructor is default
//		System.out.println(Classroom.roomNumber);
		System.out.println(Classroom.floor);
//		System.out.println(Classroom.teacherName);
	}

}