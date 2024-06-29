package java_io;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class buffered_input_stream {
    public static void main(String[] args) {
        // Specify the absolute file path
        String filePath = "C:/Users/YourUsername/Desktop/bos.txt";  // Example absolute path

        try {
            // Create a FileInputStream
            FileInputStream fis = new FileInputStream(filePath);
            
            // Create a BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            // Read bytes from the BufferedInputStream until end of file (-1)
            while ((i = bis.read()) != -1) {
                // Print character corresponding to the byte read
                System.out.print((char) i);
            }

            // Close BufferedInputStream and FileInputStream
            bis.close();
            fis.close();

        } catch (IOException e) {
            // Handle file not found or other IO exceptions
            e.printStackTrace();
        }
    }
}
