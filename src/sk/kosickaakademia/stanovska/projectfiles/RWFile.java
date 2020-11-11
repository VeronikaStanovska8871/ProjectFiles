package sk.kosickaakademia.stanovska.projectfiles;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RWFile {
    public void copyFileWithCapital(String fileName) {
        BufferedReader reader;
        try {
            FileReader fr = new FileReader(fileName);
            File file = new File("output/" + getFileName());
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toUpperCase();
                System.out.println(line);
                fw.write(line);
            }
            fr.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public String getFileName() {
        String name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH-mm-ss");
        Date date = new Date();
        name = "b." + date;
        return name;
    }

    public void copyAndEncryptFile(String fileName) {
        BufferedReader reader;
        try {
            FileReader fr = new FileReader(fileName);
            File file = new File("output/" + getFileNameEncrypt());
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            reader = new BufferedReader(fr);
            String line;
            char shift=3;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < fileName.length(); i++) {
                    char z = (fileName.charAt(i);
                    if (z!=" "){
                        char encrypt= (char) (z+shift);
                    System.out.println(encrypt);
                }
                }
                fr.close();
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getFileNameEncrypt() {
        String name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH-mm-ss");
        Date date = new Date();
        name = "c_" + date;
        return name;
    }
}

