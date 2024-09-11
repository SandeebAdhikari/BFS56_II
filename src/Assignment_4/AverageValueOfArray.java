package Assignment_4;

public class AverageValueOfArray {
    public static void main(String[] args) {
        int [] num = {2,1,0,9,12,8,5,10};
        int sum = 0;
        int average = 0;
        int n= num.length;
        for( int i = 0; i < n; i++){
            sum += num[i];
            average = sum / n;
        }
        System.out.println("The average value of is "+ average);
    }
}
