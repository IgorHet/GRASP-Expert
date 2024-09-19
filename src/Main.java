public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт користувача
        User user = new User("John Doe");

        // Створюємо об'єкт адреси
        Address address = new Address("123 Main St", "Kyiv", "Ukraine");

        // Встановлюємо адресу користувачу
        user.setAddress(address);

        // Виводимо адресу користувача
        System.out.println(user.getAddress());

        // Або виведемо повну інформацію про користувача
        System.out.println(user);
    }
}