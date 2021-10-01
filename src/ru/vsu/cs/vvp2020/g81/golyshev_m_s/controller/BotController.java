package ru.vsu.cs.vvp2020.g81.golyshev_m_s.controller;

import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Game;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Move;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.service.GameService;

import java.util.Random;

public class BotController implements PlayerMover{
    private final static Random rnd = new Random();
    private final GameService gameService;

    public BotController(GameService gameService) {
        this.gameService = gameService;
    }

    public void startGame(Game game) {

    }

    @Override
    public Move getMove(Game game) {
        int from  = rnd.nextInt();
        int to = rnd.nextInt();
        int num = rnd.nextInt();
        return Move();
    }
}
