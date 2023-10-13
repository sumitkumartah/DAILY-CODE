import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0 ) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int cnt = 0,i,j;

            for (i = min; i <= max; i++) {
                for (j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        break;
                    }
                }

                if (j > i / 2 && i != 1) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
