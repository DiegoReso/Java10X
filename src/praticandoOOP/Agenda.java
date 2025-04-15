package praticandoOOP;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contato;

    public Agenda() {
        this.contato = new ArrayList<>();
    }


    public List<Contato> getContato() {
        return contato;
    }

    public void setContato(List<Contato> contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contato=" + contato +
                '}';
    }
}
