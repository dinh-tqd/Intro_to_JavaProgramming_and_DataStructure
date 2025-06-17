package test;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        File folder = new File("src/test/TestFolder");
        if (!folder.exists())
            folder.mkdir();
        File[] files = folder.listFiles();
        System.out.println(files.length == 0);
    }
}
