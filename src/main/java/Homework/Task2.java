package Homework;
import java.io.FileWriter;
import java.io.IOException;
public class Task2 {
    public static void main(String[] args) {


        String FileTest = "FileTest.txt";
        String text = "TEST";
        int numberRepetitions = 100;
        writeLine(FileTest, repeatText(text, numberRepetitions));
    }



    private static String repeatText(String str, int numberRepetitions) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberRepetitions; i++) {
            sb.append(str).append(' ');
        }
        return sb.toString();
    }

    public static void writeLine(String FileTest, String str) {
        try (FileWriter fw = new FileWriter(FileTest, false)) {
            fw.write(str);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
