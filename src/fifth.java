import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int nos=sc.nextInt();
        int[] grad=new int[nos];
        for(int i=0;i<nos;i++) {
            System.out.print("Enter the grade for student "+(i+1)+"(should be between 0-100):");
            grad[i]=sc.nextInt();
        }
        int total=grad[0], min=grad[0], max=grad[0];
        for(int i=1;i<nos;i++) {
            total+=grad[i];
            if(min>grad[i])
                min=grad[i];
            if(max<grad[i])
                max=grad[i];
        }
        System.out.println("The average is "+(float)total/nos);
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);


    }
}
