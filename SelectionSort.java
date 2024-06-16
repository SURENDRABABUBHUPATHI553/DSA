package Sorting;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int temp;
        System.out.print("Enter the length of Array : ");
        int len = sc.nextInt();
        System.out.print("Enter the numbers : ");
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
            num = sc.nextInt();
            arr[i] = num;
        }

        // for(int i=0; i<len; i++) {
        //     for(int j=i+1; j<len; j++) {
        //         if(arr[i] > arr[j]) {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        int minInd;
        int minVal;
        for(int i=0; i<len; i++) {
            minVal = arr[i];
            minInd = i;
            for(int j=i+1; j<len; j++) {
                if(minVal > arr[j]) {
                    minVal = arr[j];
                    minInd = j;
                }
            }
            temp = arr[i];
            arr[i] = minVal;
            arr[minInd] = temp;
        }


        for(int i=0; i<len; i++) {
            System.out.println(arr[i]);
        }
    }
}
