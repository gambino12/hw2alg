
    public class Laptop implements Comparable<Laptop>{
        public double price;
        public int ram;
        public Brand brand;

        public Laptop() {
            this.price = RandomLap.randomPrice();
            this.ram = RandomLap.randomRam();
            this.brand = RandomLap.randomBrand();
        }

        @Override
        public int compareTo(Laptop o) {
            if (this.price == o.price) {
                if (this.ram == o.ram){
                    return Integer.compare(this.brand.getCode(), o.brand.getCode());
                }
                return Integer.compare(this.ram, o.ram);
            }
            return Double.compare(this.price, o.price);
        }

        @Override
        public String toString() {
            return "Price: " + price +
                    ", Ram: " + ram +
                    ", Brand: " + brand;
        }
    }

