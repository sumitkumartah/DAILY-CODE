import java.util.*;

class A {
    int n;

    A(int n) {
        this.n = n;
    }

    void armstrong() { 
        int c = 0, s = 0, i, p, temp;
        temp = n;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        n = temp;
        while (n != 0) {
            int rem = n % 10;
            p = 1;
            for (i = 0; i < c; i++) { 
                p = p * rem;
            }
            s = s + p;
            n = n / 10;
        }
        if (s == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println(" Not Armstrong Number"); 
        }
    }
}

class B {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");
        num = sc.nextInt();
        A obj = new A(num);
        obj.armstrong();
        
    }
}

