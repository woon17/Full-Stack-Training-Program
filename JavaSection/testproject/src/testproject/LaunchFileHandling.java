package testproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

class TryFileReaderWriter {
	Path ioFolderPath;

	TryFileReaderWriter(Path ioFolderPath) {
		this.ioFolderPath = ioFolderPath;
	}

	void perform() throws Exception {
		FileReader fr = new FileReader(ioFolderPath.toString() + "/input.txt");
		FileWriter fw = new FileWriter(ioFolderPath.toString() + "/output.txt");
		int a;
		while ((a = fr.read()) != -1) {
			System.out.println((char) a);
			fw.write(a);
		}
		fw.flush();
	}
}

class TryFileInputOutputStream {
	Path ioFolderPath;

	TryFileInputOutputStream(Path ioFolderPath) {
		this.ioFolderPath = ioFolderPath;
	}

	void perform() throws Exception {
		FileInputStream fis = new FileInputStream(ioFolderPath.toString() + "/input.txt");
		FileOutputStream fos = new FileOutputStream(ioFolderPath.toString() + "/output.txt");
		int a;
		while ((a = fis.read()) != -1) {
			System.out.println(fis.available() + ": " + (char) a);
			fos.write(a);
		}
	}

}

//for string type data
class TryFileReaderWriterForString {
	Path ioFolderPath;

	TryFileReaderWriterForString(Path ioFolderPath) {
		this.ioFolderPath = ioFolderPath;
	}

	void perform() throws Exception {
		FileReader fr = new FileReader(ioFolderPath.toString() + "/input.txt");
		FileWriter fw = new FileWriter(ioFolderPath.toString() + "/output.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String a;
		while ((a = br.readLine()) != null) {
			System.out.println(a);
			bw.write(a);
		}
		bw.flush();
	}
}

public class LaunchFileHandling {
	public static void main(String[] args) throws Exception {
		System.out.println("hello world");
		Path ioFolderPath = Paths.get("D:", "JAVA AND ANGULAR TRAINING",
				"Full-Stack-Training-Program//JavaSection/testproject/src/io");
		System.out.println((new File(ioFolderPath.toString()).exists()));
//		System.out.println((new File(ioFolderPath.toString() + "/input.txt").exists()));
//		System.out.println((new File(ioFolderPath.toString() + "/output.txt").exists()));

//		TryFileInputOutputStream t = new TryFileInputOutputStream(ioFolderPath);
//		TryFileReaderWriter t = new TryFileReaderWriter(ioFolderPath);
		TryFileReaderWriterForString t = new TryFileReaderWriterForString(ioFolderPath);
		t.perform();


	}
}