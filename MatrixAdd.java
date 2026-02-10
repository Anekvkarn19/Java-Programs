import java.util.Scanner;
public class MatrixAdd 
{
    public static void main(String args[])
    {
      int r,c; 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the dimensions of array");
      r=sc.nextInt();
      c=sc.nextInt();
      int ar1[][];
      int ar2[][];
      int sum[][];
      ar1=new int[r][c];
      ar2=new int[r][c];
      sum=new int[r][c];
      System.out.println("Enter the elements of first matrix");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            ar1[i][j]=sc.nextInt();
        }
      }
      System.out.println("Enter the elements of second matrix");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            ar2[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            sum[i][j]=ar2[i][j]+ar1[i][j];
        }
      }
      System.out.println("The first matrix is");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            System.out.print(ar1[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The second matrix is");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            System.out.print(ar2[i][j]+" ");
        }
        System.out.println();
    }
      System.out.println("The sum of two matrix is");
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            System.out.print(sum[i][j]+" ");
        }
        System.out.println();
      }




    }
}
