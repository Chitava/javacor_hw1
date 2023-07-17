package hw1;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные для сохранения в файл--> ");
        String data = in.nextLine();
        Writer.writeToFile(data);
        System.out.println(Decorator.decorate(data, "logger.txt"));
        in.close();
    }
}
