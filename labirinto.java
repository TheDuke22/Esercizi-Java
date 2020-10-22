package com.company;

public class labirinto {
    public static void main(String[] args){
        char[][] labyrinth = new char[5][5];
        for (int i = 0; i < labyrinth.length; i++)
            for (int j = 0; j < labyrinth[0].length; j++)
                labyrinth[i][j] = '-';
        labyrinth[0][2] = 'W';
        labyrinth[0][3] = 'W';
        labyrinth[1][1] = 'W';
        labyrinth[1][3] = 'W';
        labyrinth[2][0] = 'P';
        labyrinth[2][1] = 'W';
        labyrinth[2][3] = 'W';
        labyrinth[2][4] = 'W';
        labyrinth[3][2] = 'W';
        labyrinth[3][4] = 'E';
        labyrinth[4][0] = 'W';
        labyrinth[4][4] = 'W';
    }
}
