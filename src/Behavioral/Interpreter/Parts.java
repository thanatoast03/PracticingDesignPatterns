package Behavioral.Interpreter;

import java.util.ArrayList;
import java.util.List;

interface Component {
    Integer getPrice();
}

class Leaf implements Component {
    int price;
    String name;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getPrice() {
        System.out.println(name + " price: " + price);
        return price;
    }
}

class Composite implements Component {
    List<Component> components = new ArrayList<>();
    String name;

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public Integer getPrice() {
        int sum = 0;
        for (Component c : this.components) {
            sum += c.getPrice();
        }
        System.out.println(name + " sum: " + sum);
        return sum;
    }
}
