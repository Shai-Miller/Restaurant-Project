package Menu;

public class veg_dish extends Dish {

    private boolean type;

    public veg_dish (int id, double price, String name, String description, boolean veg_or_vegan) {

        super(id,price,name,description);
        this.type = veg_or_vegan;

    }
}
