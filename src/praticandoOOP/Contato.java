package praticandoOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Contato implements Salvavel{
    private String name;
    private List<Phone> phones;
    private Address address;

    public Contato(String name, Address address){
        this.name = name;
        this.phones =  new ArrayList<>();
        this.address = address;
    }

    @Override
    public String toJSON() {
        return String.format(
                "{\"nome\": \"%s\", \"telefone\": \"%s\", \"endereco\": %s}",
                name, phones, address
        );
    }

    @Override
    public void salvarEmArquivo() {
        try (FileWriter writer = new FileWriter("contatos.txt", true)) {
            writer.write(toJSON() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String getTipo();

    public abstract void getDetails();

    public void adicionarTelefone(Phone phone){
        phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public Address getEndereco() {
        return address;
    }

    public void setEndereco(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "name=' " + name + '\'' +
                ", phone=' " + phones + '\'' +
                ", endereco= " + address +
                '}';
    }
}
