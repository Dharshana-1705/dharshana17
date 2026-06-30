import java.util.Scanner;
public class transpose
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
            int flag=0;
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    if(arr[i][j]!=arr[j][i])
                        {
                            flag=1;
                            break;
                        }
                    
                }
            }
            if(flag==0)
            {
                System.out.print("True");
            }
            else
            {
                System.out.print("False");
            }
            }
        }
        
        
    
