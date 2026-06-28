import java.util.Scanner;
public class sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        int flag=-1;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i+1]<arr[i]){
                flag++;
                break;
            }
        }
            if(flag!=0){
                System.out.println("not sorted");
            }
            else
            {
                System.out.println("sorted");
            }
            }
            }
        
            
        
    



