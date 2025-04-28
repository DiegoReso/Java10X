package RevisaoGeral.exerciseFixacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;


public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrdersStatus ordersStatus;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(Date moment, OrdersStatus ordersStatus, Client client) {
        this.moment = moment;
        this.ordersStatus = ordersStatus;
        this.client = client;
    }

    void addItem(OrderItem item){
        items.add(item);
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdersStatus getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(OrdersStatus ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {

        double sum = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Order Sumamary:\n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + ordersStatus + "\n");
        sb.append("Client: " + client.getName() + " (" + sdf1.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order items: \n");
        for (OrderItem item : items){
            sb.append(item.getProduct().getName() +  ", " + item.getPrice() + ", Quantity: " + item.getQuantity() +"," + " Subtotal: " + item.subTotal() + "\n");
            sum += item.subTotal();
        }
        sb.append("Total price: R$:" + sum);

        return sb.toString();
    }
}
