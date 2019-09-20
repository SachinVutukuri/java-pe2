class Member {
    String Name;
    int age;
    float Salary;
}

class Member_Variable{
    public static void main(String[] args) {
        Member m=new Member();
        m.Name="Harry Potter";
        m.age=30;
        m.Salary=2500.3f;
        System.out.println("Members Name: "+m.Name+"\n" + "Members Age: "+m.age+"\n" +
                "Members Salary: "+m.Salary);
    }
}
