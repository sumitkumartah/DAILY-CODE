
import java.util.*;

class A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, r1, r2, c1, c2;

        System.out.printf("Enter the number of rows of the 1st matrix: ");
        r1 = sc.nextInt();
        System.out.printf("Enter the number of columns of the 1st matrix: ");
        c1 = sc.nextInt();
        int[][] m1 = new int[r1][c1];
        System.out.println("Enter the elements of the 1st matrix: ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.printf("Enter the number of rows of the 2nd matrix: ");
        r2 = sc.nextInt();
        System.out.printf("Enter the number of columns of the 2nd matrix: ");
        c2 = sc.nextInt();
        int[][] m2 = new int[r2][c2];
        System.out.println("Enter the elements of the 2nd matrix: ");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] c = new int[r1][c2];

        mulmatrix(m1, m2, c, r1, r2, c1, c2);
    }

    static void mulmatrix(int[][] m1, int[][] m2, int[][] c, int r1, int r2, int c1, int c2) {
        int i, j, k;
        if (c1 == r2) {
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    c[i][j] = 0;
                    for (k = 0; k < c1; k++) {
                        c[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            System.out.println("Multiplication of two matrices is:");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is NOT POSSIBLE.");
        }
    }
}

