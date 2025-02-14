pakage abcdefg
import java.util.Scanner;

public class DynamicMatrix{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so hang ");
        int rows = scanner.nextInt();
        System.out.print("nhap so cot");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("nhap cac phan tu cua mang");
        for(int i =0; i<rows;i++)
        {
            for(int j=0;j<cols;j++){
                System.out.print("nhap phan tu thứ ["+ i +"]["+ j +"]");
                matrix[i][j] = scanner.nextInt();

            }
        }

        System.out.println("Mang 2d vua nhap...");
        for(int i=0;i<rows;i++){
            for(int j=0 ;j<cols;j++)
            {
                System.out.print(matrix[i][j]+"\t");

            }
            System.out.println();

        }

        scanner.close();
    }
}
