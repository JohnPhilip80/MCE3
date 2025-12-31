package edu.mce.john.oms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.mce.john.oms.model.CardPayment;
import edu.mce.john.oms.model.Customer;
import edu.mce.john.oms.model.Order;
import edu.mce.john.oms.model.Payment;
import edu.mce.john.oms.model.Product;
import edu.mce.john.oms.model.UPIPayment;
import edu.mce.john.oms.repository.Repository;
import edu.mce.john.oms.service.OrderService;

public class OMSApp {

    private static Repository<Product> productRepo = new Repository<>();
    private static OrderService orderService = new OrderService();
    private static List<Product> cart = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Sample products
        productRepo.add(new Product(1, "Laptop", 60000));
        productRepo.add(new Product(2, "Phone", 30000));
        productRepo.add(new Product(3, "Headphones", 2000));

        Customer customer = new Customer(1, "John");

        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== ONLINE ORDER MANAGEMENT SYSTEM =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. View All Orders");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> viewProducts();
                case 2 -> addToCart();
                case 3 -> viewCart();
                case 4 -> placeOrder(customer);
                case 5 -> orderService.showOrders();
                case 0 -> {
                    exit = true;
                    System.out.println("Thank you for using OMS!");
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void viewProducts() {
        System.out.println("\nAvailable Products:");
        productRepo.getAll().forEach(System.out::println);
    }

    private static void addToCart() {
        viewProducts();
        System.out.print("Enter product index (0-based): ");
        int index = sc.nextInt();

        productRepo.find(index).ifPresentOrElse(
                product -> {
                    cart.add(product);
                    System.out.println("Product added to cart.");
                },
                () -> System.out.println("Product not found!")
        );
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("\nYour Cart:");
        cart.forEach(System.out::println);
    }

    private static void placeOrder(Customer customer) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Add products first.");
            return;
        }

        Order order = new Order(new ArrayList<>(cart));
        double amount = order.totalAmount();
        amount = customer.applyDiscount(amount);

        System.out.println("Total after discount: ₹" + amount);
        System.out.println("Select Payment Method: 1. Card  2. UPI");

        int payChoice = sc.nextInt();
        Payment payment = (payChoice == 1) ? new CardPayment() : new UPIPayment();
        payment.pay(amount);

        orderService.placeOrder(order);
        cart.clear();

        System.out.println("Order placed successfully!");
    }
}
