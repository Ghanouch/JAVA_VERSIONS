package JAVA_8.METHOD_REFERENCE;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public static boolean isRealUser(User u)
    {
        return true;
    }

    public boolean isLegalUser(User u)
    {
        return true;
    }


}
