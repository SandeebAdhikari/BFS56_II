package Assignment_3;

public class PatternThree {
    public static void main(String[] args) {
        String star = "*";
        patterThree(star);
    }
    private static  void patterThree(String star){
            for(int i = 1; i <= 5; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(star);
                }
                System.out.println();
            }
    }
}
