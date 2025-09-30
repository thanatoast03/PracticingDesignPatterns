package Behavioral.Mediator;

interface ComputerFuncs {
    void send(Computer computer);
    void receive(String message);
}

class Computer implements ComputerFuncs {
    private Mediator mediator;

    public Computer(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(Computer computer) {
        System.out.println("Message sent to computer from mediator");
        mediator.transmit(this, computer, "Hello from computer 1");
    }

    @Override
    public void receive(String message) {
        System.out.println("Computer received message: " + message);
    }
}
