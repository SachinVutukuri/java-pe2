import java.util.Scanner;

public class User {
    String firstName, lastName;
    int age;
    double salary;
    boolean isValidAge() {
        if(age>18 && age<60)
            return true;
        return false;
    }
    String getFullName() {
        return firstName+" "+lastName;
    }
}

class Test {
    public static void main(String[] args) {
        User u=new User();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name:");
        u.firstName=sc.nextLine();
        System.out.print("Enter last name:");
        u.lastName=sc.nextLine();
        System.out.print("Enter age:");
        u.age=sc.nextInt();
        while(u.age<0 || u.age>100) {
            System.out.print("Invalid age, please enter again:");
            u.age=sc.nextInt();
        }
        System.out.print("Enter salary:");
        u.salary=sc.nextDouble();
        System.out.println(u.isValidAge());
        System.out.println(u.getFullName());

    }
}
