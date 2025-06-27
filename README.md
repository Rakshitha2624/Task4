# Task4
A straightforward Java-based console program designed to create and manage notes using file input and output operations.

## Features

* Allows users to add and save multiple notes
* Displays all previously stored notes
* Notes are persisted in a simple text file (`notes.txt`)

##  How to Run in Eclipse

1. Launch Eclipse IDE.
2. Create a new *Java Project* (e.g., `NotesApp`)
3. Inside the `src` folder, create a new *Java Class* named `Noteapp`
4. Enable the checkbox for `public static void main(String[] args)`
5. Copy and paste the full source code into the class
6. Right-click on the class file → *Run As* → *Java Application*

## Files Involved

* `Noteapp.java` – Main class containing the logic
* `notes.txt` – Automatically created to store all user notes in plain text

## Core Concepts Demonstrated

* Writing data to a file using `FileWriter`
* Reading data line-by-line with `BufferedReader`
* File handling through `try-with-resources`
* Exception management using `IOException` and `FileNotFoundException`
* Command-line interaction using a menu-driven approach
