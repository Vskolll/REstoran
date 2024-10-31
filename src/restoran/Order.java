package restoran;

import java.util.List;

public class Order {
    private String orderNumber; // Номер замовлення 📜
    private String customerName; // Ім'я клієнта 🧑‍🍳
    private List<String> dishes; // Список страв 🍲

    // Конструктор для ініціалізації замовлення 🎉
    public Order(String orderNumber, String customerName, List<String> dishes) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.dishes = dishes;
    }

    // Геттер для номера замовлення 🏷️
    public String getOrderNumber() {
        return orderNumber;
    }

    // Геттер для імені клієнта 📛
    public String getCustomerName() {
        return customerName;
    }

    // Геттер для списку страв 🍽️
    public List<String> getDishes() {
        return dishes;
    }

    // Перевизначення toString для гарного відображення замовлення 📝
    @Override
    public String toString() {
        return "Замовлення #" + orderNumber + " для " + customerName + ", страви: " + dishes;
    }
}
