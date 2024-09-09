package Assignment_3.ForLoops;


import static Assignment_3.utilities.Utilities.InputString;

public class ArmstrongNumber {
    public static void main(String[] args) {
        String num = InputString();
        if(armstrongNumber(num)){
            System.out.println("The number "+num+" is Armstrong Number ");
        }else{
            System.out.println("The number "+num+" is not Armstrong Number ");
        }
    }
    private static boolean armstrongNumber(String num){
        int n = num.length();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int digit = Character.getNumericValue(num.charAt(i));  // Convert char to int
            sum += (int) Math.pow(digit, n);
        }
        return sum == Integer.parseInt(num);
    }
}
