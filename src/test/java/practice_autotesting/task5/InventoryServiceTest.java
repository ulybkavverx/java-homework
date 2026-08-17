package practice_autotesting.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    private InventoryService inventoryService;

    @BeforeEach
    public void setup() {
        inventoryService = new InventoryService(true);
    }

    // addProduct(): добавить товар на открытый склад
    @Test
    public void shouldAddProductWhenInventoryIsOpen() {
        Product banana = new Product("Banana", 3.2, "Food");

        inventoryService.addProduct(banana);

        assertEquals(banana, inventoryService.getProduct("Food"));
    }

    // addProduct(): товар НЕ должен добавиться, склад закрыт
    @Test
    public void shouldNotAddProductWhenInventoryIsClosed() {
        InventoryService closedInventory = new InventoryService(false);

        Product banana = new Product("Banana", 3.2, "Food");

        closedInventory.addProduct(banana);

        assertThrows(
                OutOfStockException.class,
                () -> closedInventory.getProduct("Food")
        );
    }

    // getProduct(): товар по существующей категории
    @Test
    public void shouldGetProductByCategory() {
        Product banana = new Product("Banana", 3.2, "Food");

        inventoryService.addProduct(banana);

        Product result = inventoryService.getProduct("Food");

        assertEquals(banana, result);
    }

    // getProduct(): товар по НЕсуществующей категории
    @Test
    public void shouldThrowsExceptionWhenCategoryDoesNotExist() {
        assertThrows(
                OutOfStockException.class,
                () -> inventoryService.getProduct("Food")
        );
    }

    // findProductByCategory(): фильтрация по категории
    @Test
    public void shouldFindProductsByCategory() {
        Product banana = new Product("Banana", 3.2, "Food");
        Product apple = new Product("Apple", 3.0, "Food");
        Product shirt = new Product("Shirt", 5.9, "Clothes");

        inventoryService.addProduct(banana);
        inventoryService.addProduct(apple);
        inventoryService.addProduct(shirt);

        List<Product> result = inventoryService.findProductByCategory("Food");

        assertEquals(
                List.of(banana, apple),
                result
        );
    }

    // findProductByCategory(): ничего не найдено
    @Test
    public void shouldReturnEmptyListWhenCategoryDoesNotExist() {
        List<Product> result = inventoryService.findProductByCategory("Food");

        assertTrue(result.isEmpty());
    }

    // findProductByPrice(): фильтрация по цене
    @Test
    public void shouldFindProductsByPrice() {
        Product banana = new Product("Banana", 3.0, "Food");
        Product apple = new Product("Apple", 5.0, "Food");
        Product shirt = new Product("Shirt", 50.0, "Clothes");

        inventoryService.addProduct(banana);
        inventoryService.addProduct(apple);
        inventoryService.addProduct(shirt);

        List<Product> result = inventoryService.findProductByPrice(5.0);

        assertEquals(
                List.of(banana, apple),
                result
        );
    }

    // findProductByPrice(): фильтрация по цене, ни один товар не подходит по цене
    @Test
    public void shouldReturnEmptyListWhenNoProductsMatchPrice() {
        Product banana = new Product("Banana", 3.0, "Food");

        inventoryService.addProduct(banana);

        List<Product> result = inventoryService.findProductByPrice(6.0);

        assertFalse(result.isEmpty());
    }

}
