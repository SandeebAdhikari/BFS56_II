package Assignment_3.Patterns;

public class PatternOne {
    public static void main(String[] args) {
        int [] input = {1,2,3,4,5};
        patterOne(input);
    }

    public static void patterOne(int [] input){
        for( int i = 0; i < input.length ; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print(input[j]);
            }
            System.out.println();
        }
    }
}
