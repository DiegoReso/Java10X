package RevisaoGeral;

import java.util.Date;

public class ProdutoUsandoEnum {
    private String name;
    private OderStatusEnum ordersStatus;
    private Date moment;


    public ProdutoUsandoEnum() {
    }

    public ProdutoUsandoEnum(String name, OderStatusEnum ordersStatus, Date moment) {
        this.name = name;
        this.ordersStatus = ordersStatus;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OderStatusEnum getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(OderStatusEnum ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    @Override
    public String toString() {
        return "ProdutoUsandoEnum{" +
                "name='" + name + '\'' +
                ", ordersStatus=" + ordersStatus +
                ", moment=" + moment +
                '}';
    }
}
