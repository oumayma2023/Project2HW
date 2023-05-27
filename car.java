package Project2HW;



    // Car class
    public class car {
        private double carPrice;
        private String color;

        public car(double carPrice, String color) {
            this.carPrice = carPrice;
            this.color = color;
        }

        public double calculateSalePrice() {
            return carPrice;
        }
    }

    // Truck class, subclass of Car
    class Truck extends car {
        private double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        public double calculateSalePrice() {
            double salePrice = super.calculateSalePrice();

            if (weight > 2000) {
                salePrice -= (salePrice * 0.10); // Apply 10% discount
            } else {
                salePrice -= (salePrice * 0.20); // Apply 20% discount
            }

            return salePrice;
        }
    }

    // Sedan class, subclass of Car
    class Sedan extends car {
        private double length;

        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }

        @Override
        public double calculateSalePrice() {
            double salePrice = super.calculateSalePrice();

            if (length > 20) {
                salePrice -= (salePrice * 0.05); // Apply 5% discount
            } else {
                salePrice -= (salePrice * 0.10); // Apply 10% discount
            }

            return salePrice;
        }
    }

