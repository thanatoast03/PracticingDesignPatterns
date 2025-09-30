package Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler roleHandler = new RoleHandler();
        Handler userHandler = new UserHandler();

        // Edge cases

        // Set user handler first to recognize valid users, then set role handler next to identify permission to access
        userHandler.setNextHandler(roleHandler);

        Request request = new Request(Role.ADMIN, "user7", Level.PRIVATE); // Should not work, as user7 is not a 'valid user'
        userHandler.handle(request);

        request = new Request(Role.USER, "user6", Level.PRIVATE); // Should not work, as the user is NOT an admin (role = USER)
        userHandler.handle(request);

        System.out.println("---------------------------------------------------------------");

        // Working cases

        request = new Request(Role.USER, "user5", Level.PUBLIC); // Should work, as user is valid and accessing PUBLIC information
        userHandler.handle(request);

        request = new Request(Role.ADMIN, "user4", Level.PUBLIC); // Same logic as line 23; PUBLIC information is accessible to all roles
        userHandler.handle(request);

        request = new Request(Role.ADMIN, "user3", Level.PRIVATE); // Admins should be allowed to access PRIVATE information
        userHandler.handle(request);
    }
}
