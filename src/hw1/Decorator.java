package hw1;

public class Decorator {
    public static String decorate(String data, String filename) {
        return String.format("Фраза: %s записана в файл %s", data, filename);
    }
}
