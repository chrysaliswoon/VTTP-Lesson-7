package app.core;


//? Implement Runnable Interface
public class ThrMain implements Runnable{

    private final String msg;
    private final int sec;

    public ThrMain(String msg, int sec) {
        this.msg = msg;
        this.sec = sec;
    }    

    //? Runnable Method
    @Override
    public void run() {
        System.out.printf("Start %s\n", msg);
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException ex) {
            System.out.printf("<<< End %s\n", msg);
        }
    }
}
