class Str {
    public static void main(String args[]) {
        String x = "This is demo string";
        String y = "This is demo string2";
        int i = 20;

        // Finding the length of the string
        System.out.println("The length of the string x is= " + x.length());
        System.out.println("The length of the string y is= " + y.length());

        // Check if x is equal to y or not (return boolean)
        if (x.compareTo(y) < 0) {
            System.out.println("X is less than y");
        } else if (x.compareTo(y) > 0) {
            System.out.println("X is greater than y");
        } else {
            System.out.println("X is equal to y");
        }

        // Applying region match method
        System.out.println("X is region match with y: " + x.regionMatches(0, y, 0, 11));

        // Finding the index of character 'i' in string x
        System.out.println("Index of 'i' in string x is: " + x.indexOf('i'));

        // Finding the index of the substring "is" in x
        System.out.println("Index of 'is' in string x is: " + x.indexOf("is"));

        // Finding the last occurrence of the character 'i' in string x
        System.out.println("Last index of 'i' in string x is: " + x.lastIndexOf('i'));

        // Finding the last occurrence of the substring "is" in string x
        System.out.println("Last index of 'is' in string x is: " + x.lastIndexOf("is"));

        // Substring
        System.out.println("Substring of string x from character 4 to 15 is: " + x.substring(4, 15));

        // Finding the character at position 6 in string x
        System.out.println("Character at position 6 in x is: " + x.charAt(6));

        // Find uppercase and lowercase
        System.out.println("Uppercase: " + x.toUpperCase());
        System.out.println("Lowercase: " + x.toLowerCase());

        // Checking whether the string starts and ends with a particular string (return boolean)
        System.out.println("X starts with 'Th': " + x.startsWith("Th"));
        System.out.println("X ends with 'Th': " + x.endsWith("Th"));

        // Convert int to string
        System.out.println("Convert int to String: " + String.valueOf(i));
    }
}
