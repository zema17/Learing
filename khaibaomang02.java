import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số hàng
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();
        
        // Khai báo mảng động 2D
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Nhập dữ liệu
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>()); // Thêm hàng mới
            System.out.print("Nhập số cột cho hàng " + i + ": ");
            int cols = scanner.nextInt();
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                matrix.get(i).add(scanner.nextInt()); // Thêm phần tử vào hàng
            }
        }

        // In mảng 2D động
        System.out.println("\nMảng 2D động vừa nhập:");
        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
