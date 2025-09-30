package Behavioral.ChainOfResponsibility;

public interface Handler {
    void handle(Request request);
    void setNextHandler(Handler nextHandler);
}
