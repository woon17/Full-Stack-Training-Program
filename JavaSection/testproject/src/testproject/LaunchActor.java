package testproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;

class Actor implements Serializable {
	String name;
	int age;
	float height;

	Actor(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String toString() {
		return String.format("name:%s age:%d height:%s", this.name, this.age, this.height);
	}
}

public class LaunchActor {
	/*
	 * transfer memory object to hard disk
	 */
	public static void doSerialization(Path ioFolderPath) throws Exception {
		Actor a = new Actor("shufa", 100, 1.77f);
		System.out.println(a);
		FileOutputStream fos = new FileOutputStream(ioFolderPath.toString() + "/input.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
	}

	/**
	 * @param ioFolderPath folder path
	 * @return load object from hard disk
	 */
	public static void doDeserialization(Path ioFolderPath) throws Exception {
		FileInputStream fis = new FileInputStream(ioFolderPath.toString() + "/input.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Actor a = (Actor) ois.readObject();
		System.out.println(a);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Path ioFolderPath = Paths.get("D:", "JAVA AND ANGULAR TRAINING",
				"Full-Stack-Training-Program//JavaSection/testproject/src/io");

//		doSerialization(ioFolderPath);
		doDeserialization(ioFolderPath);

	}
}
