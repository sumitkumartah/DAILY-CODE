//returning array


class A {
    public static void main(String args[]) {
        int[] arr = m1();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }

    static int[] m1() {
        return new int[] {5, 9, 7};  // if array return array will create object before returning
    }
}
