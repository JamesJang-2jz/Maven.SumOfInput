/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        long startTimeSum = System.currentTimeMillis();
        int sum = sumOfNumbers(number);
        long sumRunTime = System.currentTimeMillis() - startTimeSum;
        System.out.println(sum);
        System.out.println("Run time for sunOfNumbers in milliseconds: " + sumRunTime);

        long startTimeGauss = System.currentTimeMillis();
        int gaussSum = gaussianSum(number);
        long sumTimeGauss = System.currentTimeMillis() - startTimeGauss;
        System.out.println(gaussSum);
        System.out.println("Run time for gaussian formula in milliseconds: " + sumTimeGauss);
    }
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++){
            count+=i;
        } return count;
    }
    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    // for Extra Credit
    static int gaussianSum(int n) {
        long startTime = System.currentTimeMillis();
        int gaussSum = 0;
        gaussSum = (n + 1) * (n/2);
        long elapsedTime = System.currentTimeMillis() - startTime;
        return gaussSum;
    }
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
