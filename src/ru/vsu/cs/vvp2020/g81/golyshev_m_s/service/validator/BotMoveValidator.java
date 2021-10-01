package ru.vsu.cs.vvp2020.g81.golyshev_m_s.service.validator;

import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Game;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Move;

public class BotMoveValidator implements MoveValidator {

    @Override
    public boolean isGood(Game game, Move move) {
        return true;
    }
}
