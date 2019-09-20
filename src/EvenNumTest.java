import java.util.Scanner;

public class EvenNumTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isEven(n));
    }

    public static boolean isEven(int number) {
        if(number%2==0)
            return true;
        return false;
    }
}
