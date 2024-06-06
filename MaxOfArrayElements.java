import java.util.Scanner;

public class MaxOfArrayElements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of th array : ");
        int num = sc.nextInt();
        int max = -999999;
        for(int i=0; i<num; i++)
        {
            System.out.println("Enter a number : ");
            int input = sc.nextInt();
            if(input > max)
            {
                max = input;
            }
        }
        System.out.println("The maximum number is "+max);
    }

}
