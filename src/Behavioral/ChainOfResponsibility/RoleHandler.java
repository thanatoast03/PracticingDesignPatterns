package Behavioral.ChainOfResponsibility;

public class RoleHandler implements Handler {
    @Override
    public void handle(Request request) {
        if (request.getConfidentialityLevel() == Level.PRIVATE) {
            if (request.getRole() == Role.ADMIN) {
                System.out.println("Admin role can access all");
            } else {
                System.out.println("Unauthorized access due to role");
            }
        } else {
            System.out.println("Accessing PUBLIC information is valid for every role");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        System.out.println("No next handler; role handler is end of line");
    }
}
