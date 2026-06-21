package homework.test_5.restaurant;

public class Main {
    /***
     * Управление рестораном
     * В меню ресторана добавляется блюдо.
     * У каждого блюда свои параметры отображения:
     * Горячее блюдо — с температурой
     * Напиток — с объёмом
     * Нужно спроектировать систему, в которой можно добавлять блюда
     * и выводить их описание с учётом характеристик.
     *
     * Сущности: Dish: HotDish, Drink, Menu
     *
     * Св-ва, действия, связи:
     * Dish -   нет св-в
     *          getDescription()
     * HotDish - temperature
     *          getDescription() - описание с температурой
     * Drink - volume // объем напитка
     *         getDescription() - описание с объемом
     * Menu - dish
     *        addDish()
     *        printMenu()
     * Связи:
     * Наследование: Dish <- HotDish, Drink
     * Абстрактный класс: наследование + полиморфизм
     * Интерфейс: полиморфизм
     */

    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish soup = new HotDish(80);
        Dish tea = new Drink(100);

        menu.addDish(soup);
        menu.printMenu();

        menu.addDish(tea);
        menu.printMenu();
    }
}
