package Restaurant;

import Menu.*;
import java.util.HashMap;

public class Rest_menu {
    private HashMap <String,menu> res_menu; //this will contain all of the restaurant menus;

    public void setRes_menu(HashMap<String, menu> res_menu) {
        this.res_menu = res_menu;
    }

    public void add_dish_to_menu (String menu, Dish dish) {
        menu m = res_menu.get(menu);
        m.add_dish(dish);

    }
    public void print_specific_menu (String menu){
        res_menu.get(menu).print_menu();
    }

}
