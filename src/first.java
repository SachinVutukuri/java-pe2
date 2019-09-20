import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int left=0,right=ch.length-1,i;
        while(left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        String str_new=new String(ch);
        System.out.println("The reversed string is:"+str_new);
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str_new.charAt(i))
            {
                System.out.println("The given string is not a palindrome");
                break;
            }
        }
        if(i==str.length())
            System.out.println("The given string is a palindrome");
    }
}
