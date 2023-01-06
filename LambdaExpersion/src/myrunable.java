public class myrunable implements Runnable {
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");
        }

    }
    public static void main(String[] args) {
       /* Runnable r=()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("child thread");
            }
        };*/
        Runnable r=new myrunable();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++)
        {System.out.println("main thread");}
    }
}
