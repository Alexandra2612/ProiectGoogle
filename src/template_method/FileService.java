package template_method;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
    private static BufferedReader reader;
    public static void setFilePath(String p)
    {
        try {
            reader = new BufferedReader(new FileReader(p));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static String getLine()
    {
        try {
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
