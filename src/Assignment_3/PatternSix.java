package Assignment_3;

public class PatternSix {
    public static void main(String[] args) {
        String star = "*";
        patternSix(star);
    }
    private static void patternSix(String star){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int k= 1; k <=i; k++){
                System.out.print(star);
            }
            System.out.println();
        }
    }

}
