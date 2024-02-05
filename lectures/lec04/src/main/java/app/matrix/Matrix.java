package src.main.java.app.matrix;

import src.main.java.app.Main;
import src.main.java.app.exceptions.FormatException;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private final int[][] matrix;

    public Matrix(){
        this.matrix = new int[5][5];
    }
    public Matrix(int[][] matrix){
        this.matrix = matrix;
    }
    public Matrix(int string, int colum){
        this.matrix = new int[string][colum];
    }

    public void generateRandomMatrix(int origin, int bound) {
        Random random = new Random();
        for (int[] string : this.matrix) {
            for (int i = 0; i < string.length; i++) {
                string[i] = random.nextInt(origin, bound);
            }
        }
    }

    public void fillMatrixFromKeyboard() throws FormatException {
        Scanner scanner = new Scanner(System.in);
        for (int[] string : matrix) {
            for (int i = 0; i < string.length; i++) {
                try {
                    string[i] = scanner.nextInt();
                }catch (Exception e) {
                    throw new FormatException("Неудалось преобразовать данные в int " + e.getMessage());
                }
            }
        }
    }

    public void printMatrix(){
        for (int[] string : this.matrix) {
            System.out.print("[ ");
            for (int value : string) {
                System.out.printf("%s ", value);
            }
            System.out.print("]\n");
        }
    }
}
