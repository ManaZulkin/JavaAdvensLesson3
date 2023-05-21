package Task3;

public class Main {
    public static void main(String[] args) {
        String st = "Help people interested in this repository understand your project by adding a README.";
        System.out.println(st);
        System.out.println(st.substring(0, st.length()/2) + "\n" + st.substring(st.length()/2));
    }
}
