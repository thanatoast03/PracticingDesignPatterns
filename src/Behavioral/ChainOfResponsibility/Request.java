package Behavioral.ChainOfResponsibility;

public class Request {
    private Role role;
    private String username;
    private Level confidentialityLevel;

    public Request(Role role, String username, Level confidentialityLevel) {
        this.role = role;
        this.username = username;
        this.confidentialityLevel = confidentialityLevel;
    }

    public Role getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public Level getConfidentialityLevel() {
        return confidentialityLevel;
    }
}
