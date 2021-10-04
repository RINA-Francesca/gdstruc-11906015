package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // FROM THE LECTURE !!
//        List<Player> playerList = new ArrayList<>();

//        playerList.add(new Player(1, "Asuna", 100));
//        playerList.add(new Player(2, "LethalBacon", 205));
//        playerList.add(new Player(3, "HPDeskJet", 34));

//        System.out.println(playerList.get(1));

//        playerList.add(2, new Player(553, "Arctis", 55));

//        playerList.remove(2);

//        System.out.println(playerList.contains(new Player(2, "LethalBacon", 205)));

//        System.out.println(playerList.indexOf(new Player(2, "LethaBacon", 205)));
//        for (Player p : playerList) {
//            System.out.println(p);
//        }

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player (2, "LethalBacon", 205);
        Player hpDeskjet = new Player (3,"HPDeskjet", 34);
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();
        playerLinkedList.removePlayer();
        playerLinkedList.printList();
        playerLinkedList.sizeCounter();
        playerLinkedList.containsVar(hpDeskjet);

        System.out.println(playerLinkedList.containsVar(hpDeskjet));
        System.out.println("Index:" + playerLinkedList.inDex(lethalBacon));
    }
}
