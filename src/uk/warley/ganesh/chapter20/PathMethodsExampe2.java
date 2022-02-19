package uk.warley.ganesh.chapter20;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethodsExampe2 {

	public static void main(String[] args) {
		example1();
//		example2();

	}

	public static void example1() {

		Path path1 = Path.of("aaa");
		Path path2 = Path.of("bbb");
		Path path3 = path1.resolve(path2);
		System.out.println(path3);

		Path path4 = Path.of("aaa1\\aaa2\\.\\..");
		Path path5 = Path.of("bbb");
		Path path6 = path4.resolve(path5);
		System.out.println("--"+path6);// --aaa1\aaa2\.\..\bbb

		System.out.println("--" + path4.normalize());//--aaa1

	}

	private static void example2() {

	}

	private static void example3() {

	}

	private static void example4() {

	}

	private static void example5() {
	}

}
