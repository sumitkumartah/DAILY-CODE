class A {
    int a;
    int b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int gcd() {
        int x = 1;
        for (int i = 1; i <= a && i <= b; i++) { 
            if (a % i == 0 && b % i == 0) {
                x = i;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integer arguments.");
            return;
        }

        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);

        A obj = new A(arg1, arg2);
        int gcd = obj.gcd();

        System.out.println("GCD of " + arg1 + " and " + arg2 + " is: " + gcd);
    }
}

