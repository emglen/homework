package Homework6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task3_1 {

    public static void main(String[] args) {
        try{
            FileInputStream fStream = new FileInputStream("C:\\test\\test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fStream));
            String strLine;

            List<String> fileElements=new LinkedList<>();
            while ((strLine = br.readLine()) != null){
                fileElements.add(strLine);
            }

            System.out.println("Elements with file: ");
            for (String element: fileElements){
                System.out.println(element);
            }

            Collections.reverse(fileElements);
            System.out.println("Elements with file after reverse: ");
            for (String element: fileElements){
                System.out.println(element);
            }
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
