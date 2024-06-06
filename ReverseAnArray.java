import java.util.Scanner;

public class ReverseAnArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        int temp;
        int i = 0;
        int j = num-1;
        while(i < j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int nums: arr){
            System.out.println(nums);
        }
        
    }
}