public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<Integer>(2);

        for (int i = 0; i < 1000; i++) {
            array.push(i);
        }

        System.out.println("Array length : " + array.length());
        Integer hi = Integer.valueOf(200);
        System.out.println("Search val is: " + array.search(hi));
    }
}
