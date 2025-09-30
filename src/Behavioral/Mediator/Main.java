package Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        // Uh it's just like a man-in-the-middle kinda
        Mediator mediator = new Mediator();
        Computer computer1 = new Computer(mediator);
        Computer computer2 = new Computer(mediator);

        computer1.send(computer2);
    }
}
