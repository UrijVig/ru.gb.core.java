### Домашнее задание второго семинара курса java core

1. Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0  
[решение](https://github.com/UrijVig/ru.gb.core.java/blob/main/home_work/hw01/task01/Main.java)

2. Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.  
[решение](https://github.com/UrijVig/ru.gb.core.java/blob/main/home_work/hw01/task02/Main.java)

3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.  
[решение](https://github.com/UrijVig/ru.gb.core.java/blob/main/home_work/hw01/task03/Main.java)

4. Улучшить проверку выигрыша в игре - не перебирать индексы строк и столбцов, а сделать проверку в циклах  
[Полный код](https://github.com/UrijVig/ru.gb.core.java/tree/main/tictactoe/src/main/java/app)
```java
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
```