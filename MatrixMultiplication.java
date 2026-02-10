import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String args[])
    {
      int r1,r2,c1,c2; 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the dimensions of first array");
      r1=sc.nextInt();
      c1=sc.nextInt();
      System.out.println("Enter the dimensions of second array");
      r2=sc.nextInt();
      c2=sc.nextInt();
      int ar1[][];
      int ar2[][];
      int prod[][];
      if(c1!=r2)
      {
        System.out.println("Invalid Multiplication");
      }
      else
      {
      ar1=new int[r1][c1];
      ar2=new int[r2][c2];
      prod=new int[r1][c2];
      System.out.println("Enter the elements of first matrix");
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c1;j++)
        {
            ar1[i][j]=sc.nextInt();
        }
      }
      System.out.println("Enter the elements of second matrix");
      for(int i=0;i<r2;i++)
      {
        for(int j=0;j<c2;j++)
        {
            ar2[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c2;j++)
        {
            prod[i][j]=0;
            for(int k=0;k<c2;k++)
            {
              prod[i][j]+=ar1[i][k]*ar2[k][j];
            }
        }
      }
      System.out.println("The first matrix is");
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c1;j++)
        {
            System.out.print(ar1[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The second matrix is");
      for(int i=0;i<r2;i++)
      {
        for(int j=0;j<c2;j++)
        {
            System.out.print(ar2[i][j]+" ");
        }
        System.out.println();
    }
      System.out.println("The product of two matrix is");
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c2;j++)
        {
            System.out.print(prod[i][j]+" ");
        }
        System.out.println();
      }
    }




    }
}
