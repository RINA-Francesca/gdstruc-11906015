package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        CardStack stack = new CardStack();
        CardStack hand = new CardStack();
        CardStack discarded = new CardStack();

        Random gacha = new Random();

        int i;
        for (i = 0; i < 6; i++) {

            stack.pushCard(new Card("Pyro"));
            stack.pushCard(new Card("Hydro"));
            stack.pushCard(new Card("Cryo"));
            stack.pushCard(new Card("Electro"));
            stack.pushCard(new Card("Anemo"));

        }

        while (stack.cardSize() > 0) {
            cardCommands(stack, hand, discarded, gacha);
            cardInfo(stack, hand, discarded);
        }
    }

    public static void cardInfo(CardStack stack, CardStack hand, CardStack discarded) {
        System.out.println("Cards in your hand: ");
        hand.printCard();

        System.out.println("Cards left in the deck: " + stack.cardSize());
        System.out.println("Cards in discarded pile: " + discarded.cardSize());

    }

    public static void cardCommands(CardStack stack, CardStack hand, CardStack discarded, Random gacha) {
        int x;
        x = 1 + gacha.nextInt(3);

        if (x == 1) {
            int draw;
            draw = 1 + gacha.nextInt(5);

            if (draw > stack.cardSize()) {
                for (int i = 0; i < stack.cardSize(); i++) {
                    Card name = stack.peekCard();
                    hand.pushCard(name);
                    stack.popCard();
                }
            }

            else if (stack.cardSize() == 0) {
                System.out.println("Deck is empty.");
            }

            else {
                for (int i = 0; i < draw; i++) {

                    Card name = stack.peekCard();
                    hand.pushCard(name);
                    stack.popCard();
                }
            }

            System.out.println("You drew " + x);

        } else if (x == 2) {
            int draw;
            draw = 1 + gacha.nextInt(5);

            if (draw > hand.cardSize()) {
                for (int i = 0; i < hand.cardSize(); i++) {
                    Card name = hand.peekCard();
                    discarded.pushCard(name);
                    hand.popCard();
                }
            }

            else if (hand.cardSize() == 0) {
                System.out.println("Hand is empty.");
            }

            else {
                for (int i = 0; i < draw; i++) {

                    Card name = hand.peekCard();
                    discarded.pushCard(name);
                    hand.popCard();
                }
            }

            System.out.println("You discarded " + x);
        }
        else if (x == 3) {
            int draw;
            draw = 1 + gacha.nextInt(5);

            if (draw > discarded.cardSize()) {
                for (int i = 0; i < discarded.cardSize(); i++) {
                    Card name = discarded.peekCard();
                    hand.pushCard(name);
                    discarded.popCard();
                }
            }

            else if (discarded.cardSize() == 0) {
                System.out.println("Discarded is empty.");
            }

            else {
                for (int i = 0; i < draw; i++) {

                    Card name = discarded.peekCard();
                    hand.pushCard(name);
                    discarded.popCard();
                }

                System.out.println("From the discarded pile, get " + x);
            }
        }
    }
}