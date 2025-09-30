package Behavioral.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class UserHandler implements Handler {
    private Handler nextHandler;

    private Set<String> validUsers = Set.of("user1", "user2", "user3", "user4", "user5", "user6");

    @Override
    public void handle(Request request) {
        if (validUsers.contains(request.getUsername())) {
            if (nextHandler != null) nextHandler.handle(request);
        } else {
            System.out.println(request.getUsername() + " is not a valid user");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
