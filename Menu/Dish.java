package Menu;

public abstract class Dish {

        private double price;
        private int id;
        private String name;
        private String description;

        public Dish (int id, double price, String name, String description) {
            this.price = price;
            this.id = id;
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }


    }
