package RevisaoGeral.interfaces.exemplo3;

public class ComboDevice extends Device implements Scanner,Print {
    public ComboDevice(Color color) {
        super(color);
    }

    @Override
    void processDoc() {
        System.out.println("Processando arquivo");
    }

    @Override
    public void print() {
        System.out.println("imprimindo arquivo");
    }

    @Override
    public void scan() {
        System.out.println("Scan arquivo!");
    }
}
