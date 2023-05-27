package Project2HW;

// Testing the code
public class CarTest {
    public void main(String[] args) {
        Truck truck = new Truck(30000, "Red", 2500);
        System.out.println("Truck:");
        System.out.println("Sale Price: " + truck.calculateSalePrice());

        Sedan sedan = new Sedan(25000, "Blue", 18);
        System.out.println("Sedan:");
        System.out.println("Sale Price: " + sedan.calculateSalePrice());
    }
}
