package FileReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {
    public static String readFileToString(String fileName) {
        String content = "";
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);

                byte[] buffer = new byte[1024];

                while (dataInputStream.available() > 0) {
                    int bytesRead = dataInputStream.read(buffer);
                     content = new String(buffer, 0, bytesRead);
                     //System.out.print(content);
                }

                dataInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return content;
        }
    }
