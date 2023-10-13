import java.util.*;

class Myexcep extends Exception {
    public String toString() {
        return "User-defined exception -- NOT prime number not allowed";
    }
}

class A {
    void msg(int a) throws Myexcep {
        int i; // Declare 'i' here to fix the scope issue
        for (i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                throw new Myexcep();
            }
        }
        if (i > a / 2 && a != 1) {
            System.out.println("PRIME");
        } else {
            System.out.println("NOT PRIME");
        }
    }

    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value");
        num = sc.nextInt();
        A x = new A();
        try {
            x.msg(num);
        } catch (Myexcep e) {
            System.out.println("Exception handled: " + e);
        }
    }
}

