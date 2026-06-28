import java.util.Scanner;
public class lastdigit
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if((n%10)%2==0)
    {
        System.out.println("Even");
    }
    else
    {
        System.out.println("odd");
    }
}    
}
