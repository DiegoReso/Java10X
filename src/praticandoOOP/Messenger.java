package praticandoOOP;

public class Messenger {

    public void enviarMensagem() {
        verificarConexaoInternet();
        System.out.println("ENVIANDO MENSAGEM");
        salvarHistorico();
    }

    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM");
        salvarHistorico();
    }

    private void salvarHistorico(){
        System.out.println("SALVANDO HISTORICO");
    }

    private void verificarConexaoInternet(){
        System.out.println("VERIFICANDO CONEXAO INTERNET");
    }
}
