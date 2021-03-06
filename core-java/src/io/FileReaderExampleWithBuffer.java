package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderExampleWithBuffer {
    public static void main(String[] args){
        String filePath = "C:\\Users\\jrout\\Development\\Github\\batch35\\Notes.txt";
        File file = new File(filePath);
        // try with resource..

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            int c;
            while( (c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        }catch (Exception exp){
            exp.printStackTrace();
        }
        System.out.println("I am done reading..");

        // Read content from a file and write it to another file...
    }
}
