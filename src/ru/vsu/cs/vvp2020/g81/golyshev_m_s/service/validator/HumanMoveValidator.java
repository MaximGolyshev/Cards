package ru.vsu.cs.vvp2020.g81.golyshev_m_s.service.validator;

import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Card;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Game;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Move;

import java.util.List;

public class HumanMoveValidator implements MoveValidator {

    @Override
    public boolean isGood(Game game, Move move) {
        //check
        List<Card> fromCards = game.getMainField().get(move.getFrom());
        Card main = fromCards.get(fromCards.size() - move.getNumOfCards());
        List<Card> upponField = game.getMainField().get(move.getTo());
        Card uppon = upponField.get(upponField.size()-1);
        if=(main.getValue()-1 = uppon.getValue())return true;
        return false;
        return false;
    }
}
