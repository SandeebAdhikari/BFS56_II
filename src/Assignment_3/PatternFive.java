package Assignment_3;

public class PatternFive {
    public static void main(String[] args) {
        String alphabets = "ABCDE";
        patternFive(alphabets);
    }

    private static void patternFive(String alphabets){
        for(int i = 0; i < alphabets.length(); i++){
            for(int j = 0; j <= i; j++){
                System.out.print(alphabets.charAt(i));
            }
            System.out.println();
        }
    }
}
