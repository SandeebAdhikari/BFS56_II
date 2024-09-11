package Assignment_3.ForLoops;

public class PrintAsciiValues {
    public static void main(String[] args) {
        for (int i = 32; i <= 127; i++) {
            System.out.println("ASCII value of " + (char)i + " = " + i);
        }
    }
}
