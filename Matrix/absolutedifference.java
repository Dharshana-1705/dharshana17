import java.util.Scanner;
public class absolutedifference
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            }
            int p=0;
            int s=0;
            for(int i=0;i<size;i++)
            {
                p=p+arr[i][i];
                s=s+arr[i][size-1-i];
            }
            int d=p-s;
            if(d<0)
            {
                d=-d;
            }
            System.out.println(d);
        }
    }
            

    
