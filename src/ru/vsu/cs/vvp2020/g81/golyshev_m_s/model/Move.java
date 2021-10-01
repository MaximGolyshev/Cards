package ru.vsu.cs.vvp2020.g81.golyshev_m_s.model;

public class Move {
    private int from;
    private int to;
    private int numOfCards;

    public Move(int from, int to, int numOfCards) {
        this.from = from;
        this.to = to;
        this.numOfCards = numOfCards;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getNumOfCards() {
        return numOfCards;
    }
}
