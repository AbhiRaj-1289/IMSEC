class Callme
{
    void call(String msg)
    {
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.print("Interrupted");
        }
        System.out.print("]");
    }
}
class Caller implements Runnable
{
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme trgt, String s)
    {
        target = trgt;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        synchronized(target)
        {
            target.call(msg);
        }
    }
    public static void main(String[] args) 
    {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Sunchronised");
        Caller ob3 = new Caller(target, "World");
       try{
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
       }catch(InterruptedException e)
       {
        System.out.print("Interrupted");
       }
    }
}
