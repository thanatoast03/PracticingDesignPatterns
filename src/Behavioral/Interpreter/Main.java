package Behavioral.Interpreter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // As I understand it, it's like the Composite structural pattern but more focused on interpreting the meaning of the data being aggregated?

        Component hd = new Leaf("HDD", 200);
        Component mouse = new Leaf("Mouse", 20);
        Component monitor = new Leaf("Monitor", 200);
        Component keyboard = new Leaf("Keyboard", 100);
        Component ram = new Leaf("RAM", 500);
        Component cpu = new Leaf("CPU", 700);

        Composite ph = new Composite("Peripherals");
        Composite pcCase = new Composite("PC Case");
        Composite mb = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        ph.addComponent(mouse);
        ph.addComponent(keyboard);
        ph.addComponent(monitor);

        pcCase.addComponent(hd);
        pcCase.addComponent(mb);

        mb.addComponent(ram);
        mb.addComponent(cpu);

        computer.addComponent(ph);
        computer.addComponent(pcCase);

        List<Composite> composites = Arrays.asList(ph, pcCase, mb, computer);
        for (Composite composite : composites) {
            composite.getPrice();
            System.out.println("---------------------------");
        }
    }
}
