package task4;

import java.io.*;
import java.util.Scanner;

public class Noteapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "notes.txt";

        System.out.println("=== Notes Manager Application ===");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Write a new note");
            System.out.println("2. View all notes");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    writeNote(fileName, scanner);
                    break;
                case 2:
                    readNotes(fileName);
                    break;
                case 3:
                    System.out.println("Application terminated. Thank you for using Notes Manager.");
                    return;
                default:
                    System.out.println("Invalid input. Please select an option between 1 and 3.");
            }
        }
    }

    /**
     * Handles writing a note to the file using FileWriter.
     */
    public static void writeNote(String fileName, Scanner scanner) {
        System.out.println("\nEnter your note below. Type 'END' on a new line to finish:");

        StringBuilder note = new StringBuilder();
        String line;

        while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
            note.append(line).append(System.lineSeparator());
        }

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("Note Entry:\n");
            writer.write(note.toString());
            writer.write("-----\n");
            System.out.println("Note has been saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the note: " + e.getMessage());
        }
    }

    /**
     * Reads all saved notes using BufferedReader.
     */
    public static void readNotes(String fileName) {
        System.out.println("\nRetrieving saved notes...");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean isEmpty = true;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                isEmpty = false;
            }

            if (isEmpty) {
                System.out.println("No notes available to display.");
            } else {
                System.out.println("End of notes.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No existing notes file found. Please create a note first.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading notes: " + e.getMessage());
        }
    }
}
