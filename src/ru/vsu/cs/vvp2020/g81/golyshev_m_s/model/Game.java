package ru.vsu.cs.vvp2020.g81.golyshev_m_s.model;

import ru.vsu.cs.vvp2020.g81.golyshev_m_s.controller.PlayerMover;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.service.validator.MoveValidator;

import java.util.*;

public class Game {
    private List<List<Card>> mainField;
    private List<Card> homeField;
    private Stack<Card> deck;
    private Stack<Card> helpDeck;
    private Map<Card, Boolean> mapVisibleCard;
    private GameState myState;
    private int poitns;
    private MoveValidator validator;

    private PlayerMover mover;

    public MoveValidator getValidator() {
        return validator;
    }

    public void setValidator(MoveValidator validator) {
        this.validator = validator;
    }

    public GameState getMyState() {
        return myState;
    }

    public void setMyState(GameState myState) {
        this.myState = myState;
    }

    public PlayerMover getMover() {
        return mover;
    }

    public void setMover(PlayerMover mover) {
        this.mover = mover;
    }

    public List<List<Card>> getMainField() {
        return mainField;
    }

    public void setMainField(List<List<Card>> mainField) {
        this.mainField = mainField;
    }

    public List<Card> getHomeField() {
        return homeField;
    }

    public void setHomeField(List<Card> homeField) {
        this.homeField = homeField;
    }

    public Stack<Card> getDeck() {
        return deck;
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public Stack<Card> getHelpDeck() {
        return helpDeck;
    }

    public void setHelpDeck(Stack<Card> helpDeck) {
        this.helpDeck = helpDeck;
    }

    public Map<Card, Boolean> getMapVisibleCard() {
        return mapVisibleCard;
    }

    public void setMapVisibleCard(Map<Card, Boolean> mapVisibleCard) {
        this.mapVisibleCard = mapVisibleCard;
    }

    public int getPoitns() {
        return poitns;
    }

    public void setPoitns(int poitns) {
        this.poitns = poitns;
    }

}
