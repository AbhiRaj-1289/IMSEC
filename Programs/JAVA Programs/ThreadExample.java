class MyThread extends Thread
{
    public void run()
    {
        try 
        {
            System.out.println("Thread "+Thread.currentThread().threadId()+" is running");    
            
        } catch (Exception e) 
        {
            System.out.println("Something went wrong!");
        }
    }    
}
public class ThreadExample
{
    public static void main(String[] args) 
    {
        int n = 8;
        for(int i = 0; i <= 8; i++)
        {
            MyThread obj = new MyThread();
            obj.start();
        }    
    }
}