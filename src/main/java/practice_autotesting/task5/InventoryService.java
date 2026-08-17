package practice_autotesting.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InventoryService - менеджер, управляет товарами на складе
 * Product - поля: название продукта, цена и категория
 * OutOfStockException - товары заканчиваются или в указанной категории нет товаров
 * isInventoryOpen - переменная, через которую происходит управление доступа к складу
 */

public class InventoryService {
    private boolean isInventoryOpen;

    public InventoryService(boolean isInventoryOpen) {
        this.isInventoryOpen = isInventoryOpen;
    }

    // хранение товаров - Map<String, List<Product>> - ключ: категория товара
    private final Map<String, List<Product>> products = new HashMap<>();

    // метод добавления товара, если isInventoryOpen равен false, оп-ция не должна выполняться
    public void addProduct(Product product) {

        if (!isInventoryOpen) {
            return;
        }

        products
                .computeIfAbsent(
                        product.getCategory(),
                        key -> new ArrayList<>()
                )
                .add(product);

    }

    // метод получения товара по категории, если нет товара в указанной категории - OutOfStockException
    public Product getProduct(String category) {

        List<Product> categoryProducts = products.get(category);
        if (categoryProducts == null || categoryProducts.isEmpty()) {
            throw new OutOfStockException("The product is out of stock");
        }
        return categoryProducts.getFirst();
    }

    // метод для поиска товара по категории
    public List<Product> findProductByCategory(String category) {
        return products.values()
                .stream()
                .flatMap(List::stream)
                .filter(product -> product.getCategory().equals(category))
                .toList();
    }

    // фильтрация товаров по цене
    public List<Product> findProductByPrice(double price) {
        return products.values()
                .stream()
                .flatMap(List::stream)
                .filter(product -> product.getPrice() <= price)
                .toList();
    }
}
