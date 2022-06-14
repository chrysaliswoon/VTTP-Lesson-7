// package app.core;

// import java.security.SecureRandom;
// import java.util.Random;
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;

// public class LambdaMain {
//     public static void main(String[] args) {
//         ExecutorService thrPool = Executors.newFixedThreadPool(4);
//         Random rand = new SecureRandom();
//         for (int i = 0; i < 10; i++) {
//             final int x = rand.nextInt(100); //? Implicit final = Treating X as a final variable and cannot be changed
//             thrPool.submit(() -> {
//                 System.out.printf(">>> i = %d \n", x); //? Free variable = x
//             });
//         }
//         System.out.println("All done");
//     }
// }
