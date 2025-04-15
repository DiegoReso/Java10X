package praticandoOOP;

import java.io.FileWriter;
import java.io.IOException;

public class ContatoPessoal extends Contato{

    private String nickname;
    private Integer birth;

    public ContatoPessoal(String name, Address address, String nickname, Integer birth) {
        super(name, address);
        this.nickname = nickname;
        this.birth = birth;
    }

    @Override
    public String getTipo() {
        return "Pessoal";
    }

    @Override
    public void getDetails() {
        System.out.println("Nome: " + getName() + " " + " e endereco : " + getEndereco());
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "ContatoPessoal{" +
                "nickname ='" + nickname + '\'' +
                " name = '" + getName() + '\'' +
                " phone = '" + getPhones() + '\'' +
                ", birth =" + birth +
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
