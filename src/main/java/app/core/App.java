package app.core;

import java.util.Random;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Before sleep 3000" );

        //? Create a Thread Pool
        ExecutorService thrPool = Executors.newFixedThreadPool(4);

        //? Generate a random sleep timer
        Random rand = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            String msg = "Thread-%d".formatted(i);
            int sec = rand.nextInt(1, 5);
            System.out.printf("\tDispatching %s to pool \n", msg);
            
            ThrMain thr = new ThrMain(msg, sec);
            thrPool.submit(thr);
        }
        // try {
        //     Thread.sleep(3000);
        // } catch (InterruptedException ex) {
            System.out.println("Main thread: Dispatched all thread!");
        // }
    }
}
