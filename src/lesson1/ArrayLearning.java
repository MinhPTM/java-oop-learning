package lesson1;

public class ArrayLearning {
    public static void main(String[] args) {
        int [] myIntArr = {1,2,7,3,6,5,4,8,9,11};

        //1. Count how many even and odd number in integer array
        int numEven = 0;
        int numOdd = 0;
        for (int elementIndex = 0; elementIndex < myIntArr.length; elementIndex++) {
            if(myIntArr[elementIndex] % 2 == 0){
                numEven = numEven + 1;
            }else{
                numOdd = numOdd +1;
            }
        }
        System.out.println("number of even: " + numEven);
        System.out.println("number of odd: " + numOdd);

        //2. Find max in array
        int maxNum = 0;
        for (int i = 0; i < myIntArr.length; i++) {
            if (myIntArr[i] > maxNum){
                maxNum = myIntArr[i];
            }
        }
        System.out.printf("Max number is: %d\n", maxNum);

        //3. Average value
        int totalNum = 0;
        for (int index = 0; index < myIntArr.length; index++) {
            totalNum = totalNum + myIntArr[index];
        }
        double averageNum = (double) totalNum / myIntArr.length;
        System.out.println("Average number is: " + averageNum);

        //4. Sort from min to max in array

        for (int i = 0; i < myIntArr.length; i++) {
            for (int j = i + 1; j < myIntArr.length; j++) {
                if (myIntArr[j] < myIntArr[i]){
                    int temp = myIntArr[i];
                    myIntArr[i] = myIntArr[j];
                    myIntArr[j] = temp;
                }
            }
            System.out.print(myIntArr[i] + " ");
        }
        System.out.println("");

        //5. 3! = 1 * 2 * 3
        int x = 5;
        int resultX = 1;
        for (int index1 = 1; index1 <= x; index1++) {
            resultX = index1 * resultX;
        }
        System.out.printf("Factorial of " + x + " is: " + resultX);
    }
}
