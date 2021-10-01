package ru.vsu.cs.vvp2020.g81.golyshev_m_s.controller;

import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Game;
import ru.vsu.cs.vvp2020.g81.golyshev_m_s.model.Move;

import java.util.Scanner;

public class Mover implements PlayerMover{

    @Override
    public Move getMove(Game game) {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        int num = sc.nextInt();
        return new Move(from, to, num);
    }
}
