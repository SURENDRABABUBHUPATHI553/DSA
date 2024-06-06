public class RotateArrayByCW90 
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        int temp;

        for(int i=1; i<arr.length; i++)
        {
            for(int j=0; j<i; j++)     //Transpose of matrix
            {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp; 
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            int st = 0;
            int ed = arr.length-1;
            while(st < ed)
            {
                temp = arr[i][st];                  //reverse of each array in matrix
                arr[i][st] = arr[i][ed];
                arr[i][ed] = temp;
                st++;
                ed--;
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)         //Printing the matrix
            {
                System.out.println(arr[i][j]);
            }
        }
    }

}
