class Student
{
    int roll_no;
    String name;
    static String college = "IMS";
    Student(int r, String n)
    {
        roll_no = r;
        name = n;
    }
    void display()
    {
        System.out.println(roll_no+" "+name+" "+college);
    }
}
public class StaticExample1 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student(101, "Abhi");
        Student s2 = new Student(102, "Ayush");
        s1.display();
        s2.display();
    }    
}
