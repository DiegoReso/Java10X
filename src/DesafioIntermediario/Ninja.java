package DesafioIntermediario;

public class Ninja {
    private String name;
    private Integer age;
    private String village;

    public Ninja(String name, Integer age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String toString(){
        return "Ninjas : " + name + " Idade: " + age + " Aldeia: " + village;
    }
}
