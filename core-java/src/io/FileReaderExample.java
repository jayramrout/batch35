package io;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args){
        String filePath = "C:\\Users\\jrout\\Development\\Github\\batch35\\Notes.txt";
        File file = new File(filePath);

        boolean exists = file.exists();
        System.out.println(exists);

        boolean directory = file.isDirectory();

        System.out.println("directory = " + directory);

        FileReader reader = null;
//        FileInputStream
//        FileOutputStream
//        BufferedInputStream
        try {
            reader = new FileReader(file);
            int c;
            while( (c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("I am done reading..");

        // Read content from a file and write it to another file...
    }
}
