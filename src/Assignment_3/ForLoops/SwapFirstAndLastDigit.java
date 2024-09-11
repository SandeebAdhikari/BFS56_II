package Assignment_3.ForLoops;

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        int [] num = {6, 8, 1, 2, 9, 10, 15};
        swapFirstAndLastDigit(num);

        for (int i : num){
            System.out.print(i + " ");
        }
    }
    private static void swapFirstAndLastDigit(int [] num){
        int n = num.length;
        for(int i = 0; i<n; i++){
            int temp = num[i];
            num[i] = num[n-1];
            num[n-1] = temp;
            break;
        }
    }
}
