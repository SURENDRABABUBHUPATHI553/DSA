import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int len = sc.nextInt();
        int temp;
        int num;
        int[] arr = new int[len];
        System.out.print("Enter the values : ");
        for(int i=0; i<len; i++) {
            num = sc.nextInt();
            arr[i] = num;
        }
        for(int i=len-1; i>0; i--) {
            for(int j=0; j+1<i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<len; i++) {
            System.out.println(arr[i]);
        }
    }
}
