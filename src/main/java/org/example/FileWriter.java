package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWriter {

    private final Path filePath;

    public FileWriter(String fileName) {
        this.filePath = Path.of(fileName + ".txt");
        clearFileContent();
    }

    private void clearFileContent() {
        try {
            Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            handleIOException("Unable to clear file content", e);
        }
    }

    public void writeToFile(String textToWrite) {
        try {
            Files.write(filePath, (System.lineSeparator() + textToWrite).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            handleIOException("Unable to write to file", e);
        }
    }

    private void handleIOException(String message, IOException e) {
        System.err.println(message + " " + filePath + ". Error: " + e.getLocalizedMessage());
        e.printStackTrace();
    }
}
