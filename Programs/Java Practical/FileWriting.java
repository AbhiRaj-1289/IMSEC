import java.io.*;
public class FileWriting
{
    public static void main(String[] args) 
    {
        String text = "I am writing";
        try
        {
            FileWriter fw = new FileWriter("Text.txt");
            fw.write(text);
            System.out.println(text);
            fw.close();
            System.out.println("File created successfully");
        } 
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }   
    }
}

