import java.util.*;
class vowels
{
    public static void main(String args[])
    {
        int vowelcount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String input=sc.nextLine();
        int n=input.length();
        for(int i=0;i<n;i++){
            char ch=input.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
            {
                vowelcount++;
            }
        }
        System.out.println("number of vowels:"+vowelcount);
    }
}