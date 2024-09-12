package Assignment_4;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfString;

public class DuplicateValueOfArrayString {
    public static void main(String[] args) {
        String [] string = arrayOfString();
        duplicateValueOfArrayString(string);
    }
    public static void duplicateValueOfArrayString(String [] strings){
        boolean hasDuplicate = false;
        System.out.println("Duplicate string on array: ");
        for(int i =0; i < strings.length; i++){
            for(int j = i+1; j< strings.length; j++){
                if(strings[i].equalsIgnoreCase(strings[j])){
                    System.out.print(strings[i]+" ");
                    hasDuplicate= true;
                    break;
                }
            }
        }
        if(!hasDuplicate){
            System.out.println("No duplicate string in array!!");
        }
    }
}
