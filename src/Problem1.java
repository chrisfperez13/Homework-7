import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer n, greater than 0: ");
        int n = input.nextInt();

        while (n <= 0) { //need to have less then to make it true and keep going
            System.out.println("Enter an integer n, greater than 0:");
            n = input.nextInt();
        }

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 500);
        }

        System.out.println("");

        //printing out methods

        printArray(array);

        System.out.println("Maximum: " + getMax(array));

        System.out.println("Minimum: " + getMin(array));

        System.out.println("Sum: " + sumValues(array));

        System.out.println("Average: " + getAverage(array));

        System.out.println("Number of integers greater than average: " + greaterThanAverage(array));

        System.out.println("Number of time subsequent value increases: " + countInc(array));

        System.out.println("Number of times subsequent value decreases: " + countDec(array));

        printArray3Perln(array);
// here is the end of the main method
    }

    //getMax will return the max of the array
    public static int getMax(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

    // this method will return the minimum
    public static int getMin(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int sumValues(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double getAverage(int[] arr) {
        double w = (double)sumValues(arr)/ arr.length;
        return w;

/*        int sum = 0;
        int ave = 0;
        for (int i = 1; i < arr.length; i++) {
            sum =+ arr[i];
        }
        return ave;*/
    }

    public static int greaterThanAverage(int[] arr) {
        int moreThan = 0;
        int sum = 0;
        int ave;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        ave = sum/arr.length;
        for(int i = 0; i<arr.length; i++){
            if (ave < arr[i]) {
                moreThan++;
            }
        }
        return moreThan;
    }

    public static int countInc(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                count++;
            }
        }return count;
    }

    public static int countDec(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                count++;
            }
        }return count;
    }

    public static void printArray(int[] arr){
        System.out.println("Array on one line:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } System.out.println();
    }

     public static void printArray3Perln(int[] arr){
        int count = 1;
        for(int i = 0; i <arr.length; i ++){
            if (count < 3){
                System.out.print( " " + arr[i]);
                count++;
            }else {
                System.out.println(" " + arr[i]);
                count = 1;
            }
        }
     }
}


//count = 0
// if (30 > arr[i]){
// }