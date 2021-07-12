package com.fego;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileHell {
    private List<Integer> victorsIntegers;
    private static final int SIZE = 10;

    public FileHell() throws IOException {
        victorsIntegers = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            victorsIntegers.add(i);

        this.readList("infile.txt");
        this.example();
    }

    public void readList(String fileName) {
        String line = null;

        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                int i = Integer.parseInt(line);
                System.out.println(i);
                victorsIntegers.add(i);
            }
        } catch (FileNotFoundException fnf) {
            System.err.println("The file could not be fount: " + fnf.getMessage());
        }
        catch (IOException ioException) {
            System.err.println("Wrong Input type: " + ioException.getMessage());
        }
    }












    public void example() throws IOException {

        PrintWriter out = null;
        String text = "Hello";

            out = new PrintWriter(new FileWriter("outfile.txt"));
            out.write(text);

            //Close File
            if (out != null) {
                out.close();

            }

        }

    }












}




