package chatgpt2;

import java.net.*;
import java.io.*;

public class test {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://example.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            System.out.println("Webpage content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

