/*Write a Java program to multiply two matrix objects.*/
import java.util.Scanner;

class Matrix {
    int rows;
    int cols;
    int[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public void inputData(Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            return null;
        }

        Matrix result = new Matrix(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows and columns for first matrix: ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        Matrix m1 = new Matrix(r1, c1);

        System.out.print("Enter rows and columns for second matrix: ");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        Matrix m2 = new Matrix(r2, c2);

        if (c1 != r2) {
            System.out.println("Multiplication not possible. Columns of first must match rows of second.");
            return;
        }

        System.out.println("Enter elements for first matrix:");
        m1.inputData(scanner);

        System.out.println("Enter elements for second matrix:");
        m2.inputData(scanner);

        Matrix m3 = m1.multiply(m2);

        System.out.println("Resultant Matrix:");
        m3.printMatrix();
    }
}