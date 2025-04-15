package praticandoOOP;

import java.io.FileWriter;
import java.io.IOException;

public class ContatoProfissional extends Contato{

    private String occupation;
    private String company;

    public ContatoProfissional(String name, Address address, String occupation, String company) {
        super(name, address);
        this.occupation = occupation;
        this.company = company;
    }

    @Override
    public String getTipo() {
        return "Profissional";
    }

    @Override
    public void getDetails() {
        System.out.println("Nome: " + getName() + " " + "Phone: " + getPhones() + " e endereco : " + getEndereco());
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "ContatoProfissional{" +
                "occupation='" + occupation + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public String toJSON() {
        return String.format(
                "{\"nome\": \"%s\", \"telefone\": \"%s\", \"endereco\": %s}",
                getName(), getPhones(), getEndereco()
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
}
