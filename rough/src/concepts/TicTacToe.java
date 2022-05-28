package concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int turn = 0;
        turn++;

    }
}

class Position {
    int i, j;
}

class Player {
    ArrayList<Position> list = new ArrayList<>();
}

class Board {
    Player player1, player2;

    Board(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Position pos = new Position();
                pos.i = i;
                pos.j = j;
                for (Position position : player1.list) {
                    if (position.equals(pos)) {
                        System.out.println("X ");
                    } else {
                        System.out.println("_ ");
                    }

                }
            }
            System.out.println();
        }
    }
}