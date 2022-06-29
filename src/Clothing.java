public class Clothing {
    public double price;
    public String type;
    public String size;

    public Clothing(){ // no-arg constructor
        this.price = 29.9;
        this.type = "Blue";
        this.size = "Medium";
    }
    // overloaded constructor that takes tree parameters
    public Clothing(String type, String size, double price){
        this.price = price;
        this.type = type;
        this.size = size;
    }

    public void increasePrice(){ // this is it

        this.price = price + 5;
    }

    public void increasePrice(double x){

        this.price = price + x;
    }

    public void details(){
        System.out.println("Item: " + this.type);
        System.out.println("Size: " + this.size);
        System.out.println("Price: " + "$"+this.price);
        System.out.println();
    }

}
