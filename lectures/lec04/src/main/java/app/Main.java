package src.main.java.app;

import src.main.java.app.exceptions.FormatException;
import src.main.java.app.matrix.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.generateRandomMatrix(3,17);
        matrix.printMatrix();
        while (true) {
            try {
                matrix.fillMatrixFromKeyboard();
                matrix.printMatrix();
                break;
            } catch (FormatException e) {
                System.out.println(e.getMessage());

            }
        }

    }
}
