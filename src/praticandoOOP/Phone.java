package praticandoOOP;

public class Phone {

    private TipoTelefone tipo;
    private String numero;

    public Phone(TipoTelefone tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "tipo=" + tipo +
                ", numero='" + numero + '\'' +
                '}';
    }
}
