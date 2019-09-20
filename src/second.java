import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=1) {
            if (n % 4 != 0) {
                System.out.print("Given no is not a power of 4");
                break;
            }
            n=n/4;
        }
        if(n==1)
            System.out.print("Given no is a power of 4");
    }
}

