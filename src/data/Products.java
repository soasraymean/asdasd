package data;

public class Products {
    private final String id;
    private final String name;
    private final int price;

   public Products(String id, String name, int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
