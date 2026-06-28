import java.util.Scanner;
public class countstring {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vowel=0;
        int consonents=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='I'||ch=='O'||ch=='U')
                {
                    vowel++;
                }
                else
                {
                    consonents++;
                }
                }
            }
            System.out.println(vowel);
            System.out.println(consonents);
        
        }
    }

    

