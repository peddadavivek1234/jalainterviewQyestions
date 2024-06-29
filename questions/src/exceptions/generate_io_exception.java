package exceptions;

import java.io.*;

public class generate_io_exception {
	public static void main(String[] args) {
		// Attempting to read from a non-existent file
        File file = new File("nonexistent.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fis.read(); // Attempting to read from the file
            fis.close();
        } catch (IOException e) {
            System.err.println("IOException caught!");
            e.printStackTrace();
        }
	}
}
