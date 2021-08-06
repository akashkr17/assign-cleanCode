public class CheckClean {

    //static class
    static class Number {
        //initializing variables
        int smallestNumber,largestNumber;
    }

    //method to find the largest and smallest number from the given array
    static Number  toFindLargestAndSmallestNumber(int givenArray[], int sizeOfArray) {
        //initializer variable used in for loop
        int i;

        //new object of class Number is created
        Number number = new Number();

        if (sizeOfArray == 1){
        number.largestNumber = givenArray[0];
        number.smallestNumber = givenArray[0];
        return number;
        }
        if (givenArray[0] > givenArray[1]) {

        number.largestNumber = givenArray[0];
        number.smallestNumber = givenArray[1];
        }
        else {
        number.largestNumber = givenArray[1];
        number.smallestNumber = givenArray[0];
        }

        for (i = 2; i < sizeOfArray; i++) {
            if (givenArray[i] > number.largestNumber) {
            number.largestNumber = givenArray[i];
            }
            else if (givenArray[i] < number.smallestNumber) {
            number.smallestNumber = givenArray[i];
            }
        }
        return number;
    }

    //CheckClean class main method
    public static void main(String args[]){

        //initialising the array and size of the array
        int givenArray[] = {1000, 11, 445, 1, 330, 3000}; //declaring Array
        int sizeOfArray = 6;

        //function call for find largest and smallest number using the object of Number class
        Number number = toFindLargestAndSmallestNumber(givenArray, sizeOfArray);

        //to print the smallest and largest number into the console
        System.out.printf("\n Smallest Number : %d", number.smallestNumber);
        System.out.printf("\n Largest Number : %d", number.largestNumber);
    }
}