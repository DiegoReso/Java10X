package praticandoOOP;

public class Address {
    private String street;
    private Integer number;
    private String state;
    private Integer zipCode;

    public Address(String street, Integer number, String state, Integer zipCode) {
        this.street = street;
        this.number = number;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street=' " + street + '\'' +
                ", number= " + number +
                ", state=' " + state + '\'' +
                ", zipCode= " + zipCode +
                '}';
    }

}
