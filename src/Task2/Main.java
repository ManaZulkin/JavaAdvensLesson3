package Task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File f1 = new File("task2.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(f1));
            PrintWriter pw = new PrintWriter(new FileWriter(f1, false), true)){
            pw.println("This string i write in file");
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        }catch (Exception e){
            System.out.println("This is bad" + e.getMessage());
        }

    }
}
