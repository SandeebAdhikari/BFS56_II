package Assignment_3;

public class PatternFour {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        patternFour(num);
    }
    private static  void patternFour(int [] num){
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(num[i]);
            }
            System.out.println();
        }
    }
}
