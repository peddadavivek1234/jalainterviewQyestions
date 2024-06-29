package exceptions;
import java.io.*;

public class file_not_find {
	public static void main(String[] args) {
		// Specify an invalid file path to generate FileNotFoundException
        String filePath = "/invalid/file/location";

        try {
            // Attempt to create a BufferedReader to read the file at the specified path
            BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
        }
        // Catching the FileNotFoundException
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            /* printStackTrace() prints the throwable Exception object as well as other Information
               like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
	}
}
