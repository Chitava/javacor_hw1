package hw1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class Writer {
    public static void writeToFile (String data) throws IOException {
        try(FileWriter writer = new FileWriter("logger.txt", true)) {
            LocalDateTime time = LocalDateTime.now();
            writer.write(data+ " " + time + "\n");
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
