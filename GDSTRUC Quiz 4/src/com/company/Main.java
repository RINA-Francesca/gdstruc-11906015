package com.company;

public class Main {

    public static void main(String[] args) {
        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 640);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 684);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getName(), ploo);
        hashtable.put(wardell.getName(), wardell);
        hashtable.put(deadlyJimmy.getName(), deadlyJimmy);
        hashtable.put(subroza.getName(), subroza);
        hashtable.put(annieDro.getName(), annieDro);

        hashtable.remover("Subroza");

        hashtable.printHashtable();
        //System.out.println(hashtable.get("Subroza"));

    }
}
