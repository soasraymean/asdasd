package data;

public class OrderItems {
    private final String orderId;
    private final String productId;
    private final int quantity;

    @Override
    public String toString() {
        return "OrderItems{" +
                "orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public OrderItems(String orderId, String productId, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
