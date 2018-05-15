package exceptions;

import java.io.*;

public class ExceptionTest {
    public static void main(String[] args) throws Exception {

        String path = "D:\\a.txt";
        ExceptionTest.readTxt(path);
    }

    public static boolean readTxt(String path){
        File file = new File(path);
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(reader);
        String line = "";
        try {
            line = br.readLine();
            while (line != null){
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("success!");
        return true;
    }
}
