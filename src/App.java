import data.OrderItems;
import data.Orders;
import data.Products;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

    private static final List<Products> products = new ArrayList<>();
    private static final List<Orders> orders = new ArrayList<>();
    private static final List<OrderItems> orderItems = new ArrayList<>();

    public static void main(String[] args) {
        init();
//        products.forEach(System.out::println);
//        orders.forEach(System.out::println);
//        orderItems.forEach(System.out::println);

        task();

    }

    private static void task() {
        Date date;
        for (Orders order : orders) {
            System.out.println(order.getDate());
        }
    }

    private static void init() {
        File file = new File("products.csv");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.length()>22)
                products.add(new Products(
                        line.substring(0,line.indexOf(',')),
                        line.substring(line.indexOf(',')+1,line.lastIndexOf(',')),
                        Integer.parseInt(line.substring(line.lastIndexOf(',')+1))));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        file = new File("orders.csv");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.length()>13)
                    orders.add(new Orders(
                            line.substring(0,line.indexOf(',')),
                            line.substring(line.indexOf(',')+1)));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        file = new File("order_items.csv");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.length()>29)
                    orderItems.add(new OrderItems(
                            line.substring(0,line.indexOf(',')),
                            line.substring(line.indexOf(',')+1),
                            Integer.parseInt(line.substring(line.lastIndexOf(',')+1))));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
