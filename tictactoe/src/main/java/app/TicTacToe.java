/**
 * Класс для представления игры крестики-нолики
 */
package ru.gb.jcore.tictactoe.src.main.java.app;
// Импорты классов
import ru.gb.jcore.tictactoe.src.main.java.app.model.AI;
import ru.gb.jcore.tictactoe.src.main.java.app.model.Human;
import ru.gb.jcore.tictactoe.src.main.java.app.view.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Класс, расширяющий JFrame, для отображения графического интерфейса игры
 */
public class TicTacToe extends JFrame {
    // Константы
    final String TITLE_OF_PROGRAM = "Tic Tac Toe"; //Название заголовка
    final int WINDOW_SIZE = 330; // Размер окна
    final int WINDOW_DX = 7; // Размер по Х
    final int WINDOW_DY = 55; // Размер по Y
    final int FIELD_SIZE = 3; // Размер поля
    final int CELL_SIZE = WINDOW_SIZE / FIELD_SIZE; // Размер клетки
    final String BTN_INIT = "New game"; //Информация на кнопке активации новой игры
    final String BTN_EXIT = "Exit"; // Информация на кнопке выхода

    Panel panel; // панель для рендеринга (рисования)
    Field field; // объявить поле игрового объекта
    Human human; // Класс работы с человеком
    AI ai; // Класс реализации ИИ

    /**
     * Конструктор класса
     */
    public TicTacToe() {
        setTitle(TITLE_OF_PROGRAM);// Установка заголовка окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);// Установка операции закрытия окна
        setSize(WINDOW_SIZE + WINDOW_DX, WINDOW_SIZE + WINDOW_DY);// Установка размера окна
        setLocationRelativeTo(null); // Центрирование окна
        setResizable(false);// Запрет изменения размеров окна

        field = new Field(FIELD_SIZE, CELL_SIZE);// Создание игрового поля
        human = new Human(field.getHumanDot()); // Инициализация игрока
        ai = new AI(field.getAIDot());// Инициализация искусственного интеллекта

        panel = new Panel();// Создание панели для отрисовки
        panel.setBackground(Color.white);// Установка цвета фона
        panel.addMouseListener(new MouseAdapter() {// Обработчик событий мыши
            @Override
            public void mouseReleased(MouseEvent e) {// Обработка клика мыши
                human.turn(e.getX() / CELL_SIZE, e.getY() / CELL_SIZE, field, ai);// Ход игрока
                panel.repaint(); // Перерисовка панели
                if (field.isGameOver()) // Проверка окончания игры
                    JOptionPane.showMessageDialog(
                            TicTacToe.this, field.getGameOverMsg()); // Вывод сообщения об окончании
            }
        });

        // Создание кнопок для начала новой игры и выхода
        JButton init = new JButton(BTN_INIT);
        init.addActionListener(e -> { // lambda version // Обработчик событий для кнопки начала новой игры
            field.init(); // Инициализация игрового поля
            panel.repaint(); // Перерисовка панели
        });
        JButton exit = new JButton(BTN_EXIT);
        //exit.addActionListener(e -> System.exit(0));
        exit.addActionListener(new ActionListener() { // Обработчик событий для кнопки выхода
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Завершение программы
            }
        });

        JPanel panelBtn = new JPanel(); // Создание панели для размещения кнопок
        panelBtn.setLayout(new GridLayout()); // for panel of buttons // Установка Layout для панели кнопок
        panelBtn.add(init); // Добавление кнопки начала новой
        panelBtn.add(exit); // Добавление кнопки выхода

        //setLayout(new BorderLayout()); // by default
        add(panelBtn, BorderLayout.SOUTH); // Добавление панели для отрисовки
        add(panel, BorderLayout.CENTER); // Добавление панели кнопок
        setVisible(true); // Отображение окна
    }

    /**
     * Внутренний класс для отрисовки игрового поля
     */
    class Panel extends JPanel { // for painting
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            field.paint((Graphics2D) g);
        }
    }

    /**
     * Точка входа в приложение
     *
     * @param args системный параметр
     */
    public static void main(String[] args) {
        new TicTacToe();
    }
}
