public class sixth {

    public static void main(String[] args) {
	// write your code here
        intFactorials();
        longFactorials();

    }

    private static void intFactorials()
    {
        int fact=1,i=1,temp;
        System.out.println("Int Factorials:");
        while(true)
        {
            temp=fact*i;
            if(temp/i!=fact)
                break;
            fact=fact*i;
            System.out.println("The factorial of "+i+" is "+fact);
            i++;
        }
        System.out.println("The factorial of "+i+" is out of range");
    }

    private static void longFactorials()
    {
        long fact=1,i=1,temp;
        System.out.println("Long Factorials:");
        while(true)
        {
            temp=fact*i;
            if(temp/i!=fact)
                break;
            fact=fact*i;
            System.out.println("The factorial of "+i+" is "+fact);
            i++;
        }
        System.out.println("The factorial of "+i+" is out of range");
    }
}
