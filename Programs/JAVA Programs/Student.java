public class Student 
{
    int id;
    String name;
    int age;
    Student(int r,String n)
    {
        id = r;
        name = n;
    }
    Student(int r, String n, int a)
    {
        id = r;
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println(id+""+name+""+age);
    }
    public static void main(String[] args) 
    {
        Student s1 = new Student(101,"Abhi");    
    }
}
