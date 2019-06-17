package Homework6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Task3_2 {

    public static void getCount(String str, char symbol){
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == symbol)
            count++;
        }
        System.out.println("Count " + symbol + " in string: " + count);
    }

    public static void main(String[] args) {
        try {
            FileInputStream fStream = new FileInputStream("C:\\test\\test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fStream));
            String strLine;

            List<String> fileElements=new LinkedList<>();
            while ((strLine = br.readLine()) != null){
                fileElements.add(strLine);
            }

            for(String element: fileElements){
                getCount(element, 'a');
            }
        }
        catch (IOException e){
            e.getStackTrace();
        }
    }
}
