import java.util.*;

class ex extends Exception {
    public String toString() {
        return "USER GIVEN EXCEPTION .....Negative number";
    }
}

class A {
    long factorial(int n) throws ex {  
        if (n < 0) {
            throw new ex();
        } else {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }
}

class B {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        A obj = new A();
        try {
            long result = obj.factorial(num);
            System.out.println("Factorial of " + num + " is " + result);
        } catch (ex e) { 
            System.out.println("Exception handled: " + e);
        }
    }
}

