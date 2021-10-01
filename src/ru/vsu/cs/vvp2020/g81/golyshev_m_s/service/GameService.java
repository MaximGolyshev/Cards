package ru.vsu.cs.vvp2020.g81.golyshev_m_s.service;

import ru.vsu.cs.vvp2020.g81.golyshev_m_s.controller.PlayerMover;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Card;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Game;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.GameState;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Move;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.service.validator.MoveValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GameService {

    public void prepareGame(Game game, PlayerMover mover, MoveValidator validator) throws FileNotFoundException {  //создаём колоду, рандомно раскладываем 7 боксов
        Stack<Integer> st = new Stack<>();
        List<Card> cards = new ArrayList<>();
        //put cards to list

        Scanner sc = new Scanner(new File("cards.txt"));
        while(sc.hasNext()){
            String str = sc.nextLine();
        }

        shuffle(cards);
        for(Card c : cards){
            game.getDeck().push(c);
        }

        int numOfTheCard = 1;
        for(int i = 0; i < 7; i++){
            game.getMainField().add(new ArrayList<>());
            for(int k = 0; k < numOfTheCard; k++){
                boolean visible = k >= numOfTheCard - 1;
                Card c = game.getDeck().pop();
                game.getMainField().get(i).add(c);
                game.getMapVisibleCard().put(c, visible);
            }
            numOfTheCard++;
        }
        game.setMover(mover);
        game.setValidator(validator);


    }

    public void start(Game game) {
        while (game.getMyState() == GameState.OK){
            Move m = game.getMover().getMove(game);
            if(game.getValidator().isGood(game, m)) {
                doMove(m);
                updateState(game);
            }
        }
    }

    private void shuffle(List<Card> list){

    }
    public GameState makeUsualMove() {

        return null;
    }

    public GameState tapHome() {

        return null;
    }

    public GameState moveFromHomeHelp() {

        return null;
    }

    private void doMove(Move move){
        //doing move
    }

    private boolean gameIsEnd(){
        return false;
    }
    

     private void updateState(Game game){
        if(){
            game.setMyState(GameState.END);
        }
     }
}
