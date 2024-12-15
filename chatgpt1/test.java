package chatgpt1;
import java.io.*;

public class test {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, Java I/O!";
        
        try {
            // 寫入檔案
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
            
            // 讀取檔案
            FileReader reader = new FileReader(fileName);
            int ch;
            System.out.println("Reading file content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

