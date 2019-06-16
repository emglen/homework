package Lesson6Practic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Files {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        InputStreamReader inputStreamReader=null;
        int b=0;

        try {
            fileInputStream=new FileInputStream("C:\\myfolder\\hello.txt");
            inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");
            while ((b=inputStreamReader.read())!=-1){
                System.out.println((char) b);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            try {
                inputStreamReader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}