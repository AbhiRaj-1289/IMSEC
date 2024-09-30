import java.util.Scanner;
class Eligibility
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int age, weight;
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your weight: ");
        weight = input.nextInt();
        if(age >= 18 && weight >= 50)
        {
            System.out.println("You are eligible to donate blood");
            }
            else
            {
                System.out.println("You are not eligible to donate blood");
            }
    }
}