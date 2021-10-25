import java.io.*;


public class TypingSpeedTest {


    public static void readtxt(String file) throws IOException {


        // Passing the path to the file as a parameter
        FileReader fr = new FileReader(file);
 
        // Declaring loop variable
        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)
 
            // Print all the content of a file
            System.out.print((char)i);

        fr.close();
    }



    
}
