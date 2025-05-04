package RevisaoGeral.interfaces.exemplo3;

public class Program {
    public static void main(String[] args) {


        ComboDevice comboDevice = new ComboDevice(Color.BLACK);
        comboDevice.processDoc();
        comboDevice.print();
        comboDevice.scan();

    }
}
