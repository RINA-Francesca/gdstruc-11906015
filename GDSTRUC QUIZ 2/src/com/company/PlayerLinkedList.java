package com.company;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void removePlayer() {
        head = head.getNextPlayer();
    }

    public void sizeCounter() {
        PlayerNode current = head;
        int x = 0;
        while (current != null) {
            current = current.getNextPlayer();
            x++;
        }
        System.out.println("Count:" + x);
    }

    public boolean containsVar(Player currentPlayer) {
        boolean set = false;
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer() == currentPlayer) {
                set = true;
                break;
            }
            else {
                set = false;
            }
            current = current.getNextPlayer();
        }

        System.out.println("Player: " + set);
        return set;

    }

    public int inDex(Player currentPlayer) {
        int c = 0;
        PlayerNode current = head;
        while (current.getPlayer() != currentPlayer) {
            if (c == 0) {
                c++;
                current = current.getNextPlayer();
            }
        }
        return c;
    }
}
