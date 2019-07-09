import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        do {
            System.out.print("Nhap vao so hang: ");
            n = scanner.nextInt();
            System.out.print("Nhap vao so cot: ");
            m = scanner.nextInt();
        } while (m != n)
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap vao phan tu matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.print("Ma tran vua nhap la");
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.print("Tong duong cheo chinh la: " + sum);
    }
}
