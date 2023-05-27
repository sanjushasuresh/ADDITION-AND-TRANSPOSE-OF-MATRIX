import java.util.Scanner;
import java.lang.*;
public class Matrix
{
  public static void main(String args[])
  {
    int r,c,ch,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of the matrix"); 
    r=sc.nextInt();
    c=sc.nextInt();
    int[][]m1=new int[r][c];
    int[][]m2=new int[r][c];
    int[][]sum=new int[r][c];
    int[][]transpose=new int[r][c];
    System.out.println("Enter the elements of the first matrix: ");
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        m1[i][j]=sc.nextInt();
      }
    }
    while(true)
    {
      System.out.println("1.Add two matrices\n 2.Find transpose of matrix\n 3.Exit");
      System.out.println("Enter your choice: ");
      ch=sc.nextInt();
      switch(ch)
      {
        case 1:
        System.out.println("Enter the elements of the second matrix: ");
        for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            m2[i][j]=sc.nextInt();
          }
        }
        System.out.println("The sum of the two matrices is: ");
        for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            sum[i][j]=m1[i][j]+m2[i][j];
            System.out.println(sum[i][j]+"\t");
          }
          System.out.println("\n");
        }
        break;
        case 2:
        System.out.println("The transpose of the first matrix is: ");
        for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            transpose[i][j]=m1[j][i];
            System.out.println(transpose[i][j]+"\t");
          }
          System.out.println("\n");
        }
        break;
        case 3:
        System.exit(0);
        Default:
        System.out.println("Invalid input");
      }
    }
  }
}
      
     