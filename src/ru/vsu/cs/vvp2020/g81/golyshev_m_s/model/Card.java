package ru.vsu.cs.vvp2020.g81.golyshev_m_s.model;

public class Card {
    private Value value;
    private TypeOfSuit typeOfSuit;

    Card(Value value, TypeOfSuit typeOfSuit) {
        this.value = value;
        this.typeOfSuit = typeOfSuit;
    }

    public TypeOfSuit getTypeOfSuit() {
        return typeOfSuit;
    }

    public Value getValue() {
        return value;
    }

    public String getInfoOfTheCard() {
        return value.symbol + " " + typeOfSuit.symbol;
    }

    public enum Value {
        DEUCE("2"),
        TREY("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("J"), //Валет
        QUEEN("Q"), //Дама
        KING("K"), //Король
        ACE("A"); //Туз
        
        private final String symbol;

        Value(String symbol) {
            this.symbol = symbol;
        }
    }

    public enum TypeOfSuit {
        HEARTS("♥"), //Червы
        SPADES("♣"), //Трефы
        DIAMONDS("♦"), //Бубны
        CLUBS("♠"); //Пики

        private final String symbol;

        TypeOfSuit(String symbol) {
            this.symbol = symbol;
        }
    }

}
