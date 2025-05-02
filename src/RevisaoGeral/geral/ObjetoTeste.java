package RevisaoGeral.geral;

public class ObjetoTeste {

    private String name;
    private int age;


    public ObjetoTeste(String name, int age){
        this.name = name;
        this.age = age;
    }

    public ObjetoTeste() {
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Objeto teste tem o nome de " + name + " e idade de: " + age;
    }
}
