public class Test {
    public static void main(String[] args) {
        BagArray<String> bag = new BagArray<String>(10);

        if(bag.add("Hello"))
            System.out.println("Add was successful!");
        else
            System.out.println("Add was not successful");
        
        bag.add("Hello");
        bag.add("Hi");

        if (bag.contains("Hello")) {
            System.out.println("detects Hello!");
        }

        Items item = new Items("Shopping Cart", 500.12);

        System.out.println(item);
    }
}
