package restoran;

import java.util.HashMap;
import java.util.List;

public class Restaurant {
    private HashMap<String, Order> orders; // Карта замовлень 🍕🍔

    // Конструктор для ініціалізації ресторану з пустою картою замовлень 🏠
    public Restaurant() {
        orders = new HashMap<>();
    }

    // Метод для додавання замовлення до списку 🍽️
    public void addOrder(String orderNumber, String customerName, List<String> dishes) {
        Order order = new Order(orderNumber, customerName, dishes);
        orders.put(orderNumber, order);
        System.out.println("✅ Замовлення додано: " + order);
    }

    // Метод для видалення замовлення за номером замовлення ❌
    public void removeOrder(String orderNumber) {
        if (orders.containsKey(orderNumber)) {
            Order removedOrder = orders.remove(orderNumber);
            System.out.println("🚫 Замовлення видалено: " + removedOrder);
        } else {
            System.out.println("⚠️ Замовлення з номером " + orderNumber + " не знайдено!");
        }
    }

    // Метод для пошуку замовлення за номером 🔍
    public Order findOrder(String orderNumber) {
        return orders.get(orderNumber);
    }

    // Метод для виведення всіх замовлень 📋
    public void displayAllOrders() {
        System.out.println("📜 Всі замовлення в ресторані:");
        if (orders.isEmpty()) {
            System.out.println("⚠️ Замовлень немає!");
        } else {
            for (Order order : orders.values()) {
                System.out.println(order);
            }
        }
    }
}
