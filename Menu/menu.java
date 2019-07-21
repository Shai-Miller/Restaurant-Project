package Menu;

import java.util.Vector;

public class menu {
    private String name;
    private Vector<Dish> menu;

    public menu (Vector <Dish> menu, String name) {
        this.name = name;
        this.menu = menu;
    }

    public Vector<Dish> getMenu() {
        return menu;
    }

    public void add_dish(Dish dish) {
        menu.add(dish);
    }
    public void print_menu() {
        System.out.println(name + " menu");
        for (int i=0; i<menu.size(); i++) {
            Dish curr_dish = menu.elementAt(i);
            System.out.print(curr_dish.getName() + ".................." + curr_dish.getPrice());
        }
    }
}
