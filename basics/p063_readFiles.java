import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class p063_readFiles {
    public static void main(String[] args) {
        // BufferedReader : read line by line
        // FileInputStream: Img /Audio
        // RandomAccessFile : read/write for large file

        String FilePath = "p062_text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(FilePath))) {
            // System.out.println("This File Exist");

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could Not locate File");
        }
        catch(IOException e){
            System.out.println("Something Went WRONG");
        }
    }
    
}
