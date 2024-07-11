import java.util.Scanner;

class matadd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, m, n;
        System.out.println("Enter the number of rows:");
        m = in.nextInt();
        System.out.println("Enter the number of columns:");
        n = in.nextInt();
        
        int mat1[][] = new int[m][n];
        System.out.println("Enter the first matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Enter element for mat1[" + i + "][" + j + "]:");
                mat1[i][j] = in.nextInt();
            }
        }
        
        int mat2[][] = new int[m][n];
        System.out.println("Enter the second matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Enter element for mat2[" + i + "][" + j + "]:");
                mat2[i][j] = in.nextInt();
            }
        }
        
        int mat3[][] = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        System.out.println("The resultant matrix after addition is:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mat3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
