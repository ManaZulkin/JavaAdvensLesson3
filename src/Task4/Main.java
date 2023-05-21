package Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Write 'end' to stop and see result");
        File f1 = new File("task4.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(f1, false), true);
             BufferedReader br = new BufferedReader(new FileReader(f1))){
            String st;
            input(pw);
            while ((st = br.readLine()) != null){
                System.out.println(st);
            }
        }catch (Exception e) {
            System.out.println("Somthing go wrong" + e.getMessage());
        }
    }

    public static void input(PrintWriter pw){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String st;
            do{
                st = br.readLine();
                if (st.equalsIgnoreCase("end")) break;
                pw.println(st);
            }while (true);
        }catch (Exception ex){
            System.out.println("Problems with input");
        }
    }
}
