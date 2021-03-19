abstract class Machine {
    protected String brand;
    protected double weight;
    protected String countryMake;

    public Machine(String brand, double weight, String countryMake) {
        this.brand = brand;
        this.weight = weight;
        this.countryMake = countryMake;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountryMake() {
        return countryMake;
    }

    public void setCountryMake(String countryMake) {
        this.countryMake = countryMake;
    }
}

class CoffeeMachine extends Machine{
    private double coffeeQuantity;

    public CoffeeMachine(String brand, double weight, String countryMake, double coffeeQuantity) {
        super(brand, weight, countryMake);
        this.coffeeQuantity = coffeeQuantity;
    }

    public void printInfo(){
        System.out.println("brand: " + this.brand);
        System.out.println("weight: " + this.weight);
        System.out.println("country: " + this.countryMake);
        System.out.println("coffe Quantity: " + this.coffeeQuantity);
    }

    public void getCoffee(){
        if(coffeeQuantity >= 1) {
            this.coffeeQuantity -= 1;
        }
    }

    public void loadCoffee(double q){
        this.coffeeQuantity += q;
    }

    public double getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(double coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }
}

class Main{
    public static void main(String[] args) {
        CoffeeMachine coffeeM1 = new CoffeeMachine("lavazza", 1200, "Italy", 1000);
        coffeeM1.getCoffee();
        coffeeM1.loadCoffee(10);
        coffeeM1.printInfo();
    }
}
