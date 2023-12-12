import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một ma trận vuông có sẵn
        double[][] matrix = {
                {1.5, 2.0, 3.5},
                {4.0, 5.5, 6.0},
                {7.5, 8.0, 9.5}
        };

        double diagonalSum = calculateDiagonalSum(matrix);

        System.out.println("Tổng của đường chéo chính: " + diagonalSum);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu
        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = scanner.nextInt();

        double[][] userMatrix = new double[size][size];

        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        double userDiagonalSum = calculateDiagonalSum(userMatrix);

        System.out.println("Tổng của đường chéo chính: " + userDiagonalSum);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tính tổng của đường chéo chính trong ma trận vuông
    public static double calculateDiagonalSum(double[][] matrix) {
        double diagonalSum = 0;
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }

        return diagonalSum;
    }

}
