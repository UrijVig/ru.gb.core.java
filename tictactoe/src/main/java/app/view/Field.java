package ru.gb.jcore.tictactoe.src.main.java.app.view;

import java.awt.*;

/**
 * Класс Field представляет игровое поле для игры «Крестики-нолики».
 */
public class Field {

    private final int FIELD_SIZE;
    private final int CELL_SIZE;
    private final char HUMAN_DOT = 'x';
    private final char AI_DOT = 'o';
    private final char EMPTY_DOT = '.';
    private final String MSG_DRAW = "Draw, sorry...";
    private final String MSG_HUMAN_WON = "YOU WON!";
    private final String MSG_AI_WON = "AI WON!";

    private char[][] map;
    private String gameOverMsg;

    /**
     * Конструктор класса Field.
     *
     * @param field_size Размер игрового поля.
     * @param cell_size Размер каждой ячейки игрового поля.
     */
    public Field(int field_size, int cell_size) {
        FIELD_SIZE = field_size;
        CELL_SIZE = cell_size;

        map = new char[field_size][field_size];
        init();
    }

    /**
     * Заполняет игровое поле точками
     */
    public void init() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++)
                map[i][j] = EMPTY_DOT;
        }
        gameOverMsg = null;
    }

    /**
     * Метод получение размеров игрового поля
     *
     * @return размер игрового поля
     */
    public int getSize() {
        return FIELD_SIZE;
    }

    /**
     * Метод возвращающий символ, используемый игроком-человеком
     *
     * @return используемый человеком символ
     */
    public char getHumanDot() {
        return HUMAN_DOT;
    }

    /**
     * Метод возвращающий символ, используемый исскуственным интелектом
     *
     * @return используемый ИИ символ
     */
    public char getAIDot() {
        return AI_DOT;
    }

    /**
     * Метод, проверяющий закончилась ли игра
     *
     * @return True, если игра окончена, в противном случае — false.
     */
    public boolean isGameOver() {
        return gameOverMsg != null;
    }

    /**
     * Метод получения сообщения, указывающего результат игры
     *
     * @return сообщение с результатом игры
     */
    public String getGameOverMsg() {
        return gameOverMsg;
    }

    /**
     * Метод устанавливающий точку на игровом поле и проверяющий условие выигрыша или ничьей
     *
     * @param x Координата X ячейки.
     * @param y Координата Y ячейки.
     * @param dot Точка, которую нужно установить на игровом поле.
     */
    public void setDot(int x, int y, char dot) { // set dot and check fill and win
        map[x][y] = dot;
        if (checkWin(HUMAN_DOT)) gameOverMsg = MSG_HUMAN_WON;
        else if (checkWin(AI_DOT)) gameOverMsg = MSG_AI_WON;
        else if (isMapFull()) gameOverMsg = MSG_DRAW;
    }

    /**
     * Метод, проверяющий заполнена ли игровая доска.
     *
     * @return True, если игровая доска заполнена; в противном случае - false.
     */
    boolean isMapFull() {
        for (int i = 0; i < FIELD_SIZE; i++)
            for (int j = 0; j < FIELD_SIZE; j++)
                if (map[i][j] == EMPTY_DOT) return false;
        return true;
    }

    /**
     * Метод, проверяющий выиграл ли игрок с заданным символом.
     *
     * @param dot Символ игрока (человека или ИИ).
     * @return True, если игрок выиграл; в противном случае - false.
     */
    boolean checkWin(char dot) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            boolean isHorizontalWin = true;
            boolean isVerticalWin = true;
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (map[i][j] != dot) isHorizontalWin = false;
                if (map[j][i] != dot) isVerticalWin = false;
            }
            if (isHorizontalWin || isVerticalWin) return true;
        }
        boolean isDiagonal1Win = true;
        boolean isDiagonal2Win = true;
        for (int i = 0; i < FIELD_SIZE; i++) {
            if (map[i][i] != dot) isDiagonal1Win = false;
            if (map[i][FIELD_SIZE - 1 - i] != dot) isDiagonal2Win = false;
        }
        return isDiagonal1Win || isDiagonal2Win;
    }
//    boolean checkWin(char dot) {
//        // checking horizontals / verticals
//        for (int i = 0; i < FIELD_SIZE; i++)
//            if ((map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) ||
//                    (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot))
//                return true;
//        // checking diagonals
//        return (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) ||
//                (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot);
//    }

    /**
     * Метод, проверяющий допустима ли клетка для размещения нового символа.
     *
     * @param x Координата x клетки.
     * @param y Координата y клетки.
     * @return True, если клетка допустима; в противном случае - false.
     */
    public boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > FIELD_SIZE - 1 || y > FIELD_SIZE - 1) return false;
        return map[x][y] == EMPTY_DOT;
    }

    /**
     * Метод, отображающий игровую доску на экране.
     *
     * @param g Объект Graphics2D для рисования игровой доски.
     */
    public void paint(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.lightGray);
        for (int i = 1; i < FIELD_SIZE; i++) {
            g.drawLine(0, i * CELL_SIZE, FIELD_SIZE * CELL_SIZE, i * CELL_SIZE);
            g.drawLine(i * CELL_SIZE, 0, i * CELL_SIZE, FIELD_SIZE * CELL_SIZE);
        }

        g.setStroke(new BasicStroke(5));

        for (int y = 0; y < FIELD_SIZE; y++) {
            for (int x = 0; x < FIELD_SIZE; x++) {
                if (map[x][y] == HUMAN_DOT) {
                    g.setColor(Color.blue);
                    g.drawLine(x * CELL_SIZE + CELL_SIZE / 4, y * CELL_SIZE + CELL_SIZE / 4, (x + 1) * CELL_SIZE - CELL_SIZE / 4, (y + 1) * CELL_SIZE - CELL_SIZE / 4);
                    g.drawLine(x * CELL_SIZE + CELL_SIZE / 4, (y + 1) * CELL_SIZE - CELL_SIZE / 4, (x + 1) * CELL_SIZE - CELL_SIZE / 4, y * CELL_SIZE + CELL_SIZE / 4);
                }
                if (map[x][y] == AI_DOT) {
                    g.setColor(Color.red);
                    g.drawOval(x * CELL_SIZE + CELL_SIZE / 4, y * CELL_SIZE + CELL_SIZE / 4, CELL_SIZE / 2, CELL_SIZE / 2);
                }
            }
        }
    }
}
