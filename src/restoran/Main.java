package restoran;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Додаємо декілька замовлень
        restaurant.addOrder("001", "Кличко", Arrays.asList("Борщ", "Вареники"));
        restaurant.addOrder("002", "Юля Тимошенко", Arrays.asList("Каша пшинична", "Риба", "Кава"));
        restaurant.addOrder("003", "Пан Зеленський", Arrays.asList("Коровай", "Сік"));

        // Пошук замовлення
        System.out.println("\n🔍 Пошук замовлення №002:");
        System.out.println(restaurant.findOrder("002"));

        // Видалення замовлення
        System.out.println("\n❌ Видалення замовлення №001:");
        restaurant.removeOrder("001");

        // Виведення всіх замовлень
        System.out.println("\n📋 Всі замовлення:");
        restaurant.displayAllOrders();
    }
}
