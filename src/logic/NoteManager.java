package logic;

import util.DateTimeUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NoteManager {
    public static void addNoteToFile(String note) {
        String timestamp = DateTimeUtil.getCurrentDateTime();
        String formattedNote = timestamp + " -> " + note;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true))) {
            writer.write(formattedNote);
            writer.newLine();
            System.out.println("Дозапись в файл: " + formattedNote);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}