package Assignment_3.Patterns;

public class PatternTwo {
    public static void main(String[] args) {
        String alphabets = "ABCDE";
        patternTwo(alphabets);
    }
    private static void patternTwo(String alphabets){
        for( int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(alphabets.charAt(j));
            }
            System.out.println();
        }
    }

}
