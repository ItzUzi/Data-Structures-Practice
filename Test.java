public class Test {
    public static void main(String[] args) {
        BagArray<String> bag = new BagArray<String>(10);

        if(bag.add("Hello"))
            System.out.println("Add was successful!");
        else
            System.out.println("Add was not successful");
        
        System.out.println(bag.remove());
    

    }
}
