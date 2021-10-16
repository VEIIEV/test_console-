package com.company;

public class TicTacToe {
    private char[][] field = new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}};
    private int gamer;


    public void newGame() {
        field = new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}};
        gamer=0;
    }

    public String getField() {
        String str = String.format("[ \n[%c, %c, %c]\n[%c, %c, %c]\n[%c, %c, %c]\n]",
                field[0][0], field[0][1], field[0][2],
                field[1][0], field[1][1], field[1][2],
                field[2][0], field[2][1], field[2][2]);
        return str;
    }

    public String checkGame() {
        if ((field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X') ||
                (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X') ||
                (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X') ||
                (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X') ||
                (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X') ||
                (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X') ||
                (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') ||
                (field[2][0] == 'X' && field[1][1] == 'X' && field[0][2] == 'X')
        ) {
            return "X";
        } else if ((field[0][0] == 'O' && field[0][1] == 'O' && field[0][2] == 'O') ||
                (field[1][0] == 'O' && field[1][1] == 'O' && field[1][2] == '0') ||
                (field[2][0] == 'O' && field[2][1] == 'O' && field[2][2] == '0') ||
                (field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == '0') ||
                (field[0][1] == 'O' && field[1][1] == 'O' && field[2][1] == '0') ||
                (field[0][2] == 'O' && field[1][2] == 'O' && field[2][2] == '0') ||
                (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == '0') ||
                (field[2][0] == 'O' && field[1][1] == 'O' && field[0][2] == '0')
        ) {
            return "O";
        } else if (field[0][0] != '-' && field[0][1] != '-' && field[0][2] != '-' &&
                field[1][0] != '-' && field[1][1] != '-' && field[1][2] != '-' &&
                field[2][0] != '-' && field[2][1] != '-' && field[2][2] != '-') {
            return "Draw";
        } else return null;
    }

    public String makeMove( int y, int x) {
        if (checkGame() != null) {
            return "game allready over";
        } else if (!((x >= 0 && x <= 2) || (y >= 0 && y <= 2))) {
            return "wrong input";
        } else if (!(field[x][y] == '-')) {
            return "that cell occupied allready";
        } else {
            field[x][y] = (gamer % 2) == 1 ? 'X' : 'O';
            gamer++;
            return "move done";
        }


    }


}
