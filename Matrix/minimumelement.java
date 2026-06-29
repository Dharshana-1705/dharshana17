
import java.io.*;
import java.util.Scanner;
public class minimumelement
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
            for(int i=0;i<size;i++)
            {
                int max=arr[i][0];
                for(int j=0;j<size;j++)
                {
                    if(arr[i][j]>max)
                    {
                        max=arr[i][j];
                    }

                
                }
                System.out.print(max+" ");
    
            }

        }
    }

