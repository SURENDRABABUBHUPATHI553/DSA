import java.util.Scanner;

public class SumOfArrayElements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; i<num; i++)
        {
            sum += sc.nextInt();
        }
        System.out.println("The Sum of the Array Elements is "+sum);
    }
}
