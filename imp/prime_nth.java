import java.util.*;

class A {
    void prime(int a) {
        int i, j, c = 0;
        for (i = 2; c < a; i++) {
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > i/2 && j!=1) {
                c++;
            }
        }
        System.out.println(a + "th prime number is: " + (i - 1));
    }
}

class Demo {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer");
        num = sc.nextInt();
        A x = new A();
        x.prime(num);
    }
}
