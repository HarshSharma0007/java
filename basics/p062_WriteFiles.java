import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class p062_WriteFiles {
    public static void main(String[] args) {
        // FileWriter : small files
        // BufferedWritter = large amount of text
        // PrintWriter : for logs, reports
        // FileOutputStream : audio/video

        String FilePath = "p062_text.txt";
        String textContent = """
                "I am writing." In Java
                """;;
        try(FileWriter writer = new FileWriter(FilePath);) {
                writer.write(textContent);
                System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could Not Locate the File");
        }
        catch (IOException e) {
            System.out.println("Could not write in the file.");
        }
        
    }
}
