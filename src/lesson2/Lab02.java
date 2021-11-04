package lesson2;

public class Lab02 {
    public static void main(String[] args) {

        //Given a number that user inputs from keyboard, please print the stars from maximum to 1 in order, line by line
        int inputNum = 9;

        for (int i = inputNum; i > 0; i--) {
            for (int j = 0; j < i; j++){
                System.out.print("*");

            }
            System.out.println("");
        }

//        Given an array
//        Allow user to input a target number
//        Output: print out all pair of element indexes those are sum up to the target number
        int inputNumber = 7;
        int [] arr = {1,2,3,4,5,6};
        boolean isHasPair = false;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if  (arr[i] + arr[i1] == inputNumber) {
                    System.out.println("(" + i + ", " + i1 + ")") ;
                    isHasPair = true;
                }
            }
        }
        if(isHasPair == false){
            System.out.println("-1");
        }



    }
}
