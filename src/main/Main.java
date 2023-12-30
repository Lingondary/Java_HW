package main;

import logic.NoteManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();

        NoteManager.addNoteToFile(note);
    }
}