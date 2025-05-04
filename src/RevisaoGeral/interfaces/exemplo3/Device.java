package RevisaoGeral.interfaces.exemplo3;

public abstract class Device {
    private Color color;


    public Device(Color color) {
        this.color = color;
    }

    abstract void processDoc();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
