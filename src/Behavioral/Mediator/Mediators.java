package Behavioral.Mediator;

interface MediatorFunc {
    void transmit(Computer sender, Computer receiver, String message);
}

class Mediator implements MediatorFunc {
    @Override
    public void transmit(Computer sender, Computer receiver, String message) {
        System.out.println("Received message from computer: " + message);
        System.out.println("Transmitted to receiver computer");
        receiver.receive(message);
    }
}
