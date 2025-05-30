import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<MenuItem> menu;

    //constructor
    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    //getters
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void addItem(MenuItem item) {
        menu.add(item);
    }
    public List<MenuItem> getMenu() {
        return menu;
    }
    public void showMenu() {
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.get(i);
            System.out.println((i+1) + '.' + item.getName() + "   -   Rs."+ item.getPrice());

        }
    }
}
