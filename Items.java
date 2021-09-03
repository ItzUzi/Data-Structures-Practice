public class Items {
    private String description;
    private double value;

    Items(){
        this("", 0);
    }

    Items(String description, double value){
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public String toString(){

        String str = String.format("The item %s is worth $%.2f", description, value);
        return str;
    }



}
