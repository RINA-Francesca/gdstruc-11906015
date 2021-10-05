package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack() {
        stack = new LinkedList<Card>();
    }

    public void pushCard(Card card) {
        stack.push(card);
    }

    public void popCard() {
        stack.pop();
    }

    public Card peekCard() {
        return stack.peek();
    }

    public void printCard() {
        ListIterator<Card> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public int cardSize() {
        return stack.size();
    }
}