import java.util.*;

class Myexcep extends Exception {
    public String toString() {
        return "User-defined exception: Substring not found";
    }
}

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String m = sc.nextLine();

        System.out.println("Enter the substring to search for:");
        String s = sc.nextLine();

        try {
            searchSubstring(m, s);
            System.out.println("Yes");
        } catch (Myexcep e) {
            System.out.println("Exception: " + e);
        }
    }

    static void searchSubstring(String mainString, String subString) throws Myexcep {
        if (mainString.contains(subString)) {
            
            return;
        } else {
          
            throw new Myexcep();
        }
    }
}
