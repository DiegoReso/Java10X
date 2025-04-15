package praticandoOOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Messenger msn = new Messenger();

        msn.enviarMensagem();
        msn.receberMensagem();

        ContatoPessoal diego = new ContatoPessoal("Diego Reis", new Address("rua dona clovis", 15, "RJ", 6546432),
                "Dieguim", 19900422);
        diego.adicionarTelefone(new Phone(TipoTelefone.CELULAR, "212546546"));
        diego.adicionarTelefone(new Phone(TipoTelefone.WHATSAPP, "56465465464"));

        ContatoProfissional cailania = new ContatoProfissional("Cailania Reis", new Address("rua dona clovis", 15, "RJ",
                6546432),
                "Engenierr", "CBO");
        cailania.adicionarTelefone(new Phone(TipoTelefone.CELULAR, "88888"));
        cailania.adicionarTelefone(new Phone(TipoTelefone.WHATSAPP, "7777"));

        diego.salvarEmArquivo();
        cailania.salvarEmArquivo();

        List<Contato> agendaContato = new ArrayList<>();

        agendaContato.add(diego);
        agendaContato.add(cailania);

        for (Contato contato : agendaContato){
            System.out.println("Tipo: " + contato.getTipo());
            System.out.println("=======Informacoes =======");
            contato.getDetails();
            System.out.println(contato.getPhones());
        }
    }
}
