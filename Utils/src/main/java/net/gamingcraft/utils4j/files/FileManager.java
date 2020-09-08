package net.gamingcraft.utils4j.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    File file;

    public FileManager(File file) {
        this.file = file;
    }

    public void delete() {
        file.delete();
    }

    public boolean create() {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void write(String content) {
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        try {
            Scanner sc = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine() + "\n");
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public File getFile() {
        return file;
    }
}
