package pbuild;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Pbuild1 {

	public static void main(String[] arg) throws IOException {
		// creating list of process
		List<String> list = new ArrayList<String>();
		list.add("notepad.exe");

		// create the process
		ProcessBuilder build = new ProcessBuilder(list);

		// checking the command i list
		System.out.println("command: " + build.command());

		// depues de chekear el proceso lo inicializo
		build.start();

		// codigo que aproveche el proceso lanzado

	}
}
