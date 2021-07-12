package com.fego;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FixxMe {

    public static void completeTheCatchBlock(File file) throws IOException {
        RandomAccessFile input = null;
        String line = null;


        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        }

        catch (FileNotFoundException fnf){
            System.err.println("File not found: " + file);
        }
        catch (IOException e){
            System.err.println(e.toString());
        }
        finally {
            if (input != null) {
                try{
                    input.close();
                } catch (IOException e){
                    System.err.println("could not close file");
                }
            }
        }
    }
}
