package Encapsulamento;

public abstract class Ninja {

    private String name;
    private String village;
    private Integer age;
    private Integer missionsDone;
    private Double height;

    public Ninja(String name, String village, Integer age, Integer missionsDone, Double height) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.missionsDone = missionsDone;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMissionsDone(Integer missionsDone) {
        this.missionsDone = missionsDone;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getVillage() {
        return village;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMissionsDone() {
        return missionsDone;
    }

    public Double getHeight() {
        return height;
    }
}
