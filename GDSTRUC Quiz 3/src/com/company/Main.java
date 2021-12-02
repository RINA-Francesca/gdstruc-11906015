package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//      ArrayQueue queue = new ArrayQueue(5);

//      queue.add(new Player( 1, "aceu", 100));
//      queue.add(new Player( 2, "Sinatraa", 100));
//      queue.add(new Player( 3, "Subroza", 100));
//      queue.add(new Player( 4, "ploo", 100));

//      queue.printQueue();
//      queue.remove();

//      System.out.println("After popping;\n");
//      queue.printQueue();

       Random players = new Random();
       ArrayQueue queue = new ArrayQueue(10);
       int counter = 0;

       while (counter < 10) {
           playersQueue(players, queue);
           if (queue.size() < 5) {
               playersQueue(players, queue);
           }
           for (int x = 0; x < 5; x++) {
               queue.remove();
           }
           queue.printQueue();
           counter++;

           System.out.println("Games made: " + counter);
           System.out.println("Press enter to continue.");
           new java.util.Scanner(System.in).nextLine();
       }
   }

   public static void playersQueue(Random player, ArrayQueue queue) {
       int players;
       players = 1 + player.nextInt(7);

       System.out.println("In matchmaking: " + players);

       System.out.println("Added players: " + players);
       for (int i = 0; i < players; i++) {
           queue.add(new Player(1, "Rando", 10));
       }
   }
}
