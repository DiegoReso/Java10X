package RecordsJava;

public class Ninja {
    private final String name;
    private final String email;
    private final Integer tel;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getTel() {
        return tel;
    }

    public Ninja(String name, String email, Integer tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

}
