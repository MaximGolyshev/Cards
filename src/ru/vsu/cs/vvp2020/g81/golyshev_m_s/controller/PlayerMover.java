package ru.vsu.cs.vvp2020.g81.golyshev_m_s.controller;

import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Game;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Move;

public interface PlayerMover {
    Move getMove(Game game);
}
