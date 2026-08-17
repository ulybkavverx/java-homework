package practice_autotesting.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    private EntityManager<Entity> manager;

    @BeforeEach
    public void setup() {
        manager = new EntityManager<>();
    }

    // add() happy path: добавить 1 элемент в пустую коллекцию
    @Test
    public void shouldAddOneElementToEmptyList() {
        Entity user = new User("Bob", 18, true);

        manager.add(user);

        assertTrue(manager.getAll().contains(user));
        assertEquals(1, manager.getAll().size());
    }

    // add() happy path: добавить 1 элемент в НЕпустую коллекцию
    @Test
    public void shouldAddOneElementToNotEmptyList() {
        Entity user1 = new User("Bob", 18, true);
        Entity user2 = new User("Bob", 18, true);

        manager.add(user1);
        manager.add(user2);

        assertTrue(manager.getAll().contains(user2));
        assertTrue(manager.getAll().contains(user1));
        assertEquals(2, manager.getAll().size());
    }

    // add() border case: добавить null
    @Test
    public void addNullToList() {
        manager.add(null); // можно ли добавить null?

        assertThrows(
                NullPointerException.class,
                () -> manager.getAll().contains(null)
        );
    }


    // remove() happy path: удалить 1 элемент из НЕпустой коллекции
    @Test
    public void shouldRemoveElementFromNotEmptyList() {
        Entity user1 = new User("Bob", 18, true);
        Entity user2 = new User("Bob", 18, true);

        manager.add(user1);
        manager.add(user2);

        assertTrue(manager.remove(user1));

        assertTrue(manager.getAll().contains(user2));
        assertFalse(manager.getAll().contains(user1));
        assertEquals(1, manager.getAll().size());
    }

    // remove() negative: удалить элемент из пустой коллекции
    @Test
    public void shouldRemoveOneElementFromEmptyList() {
        Entity user = new User("Bob", 20, true);

        assertFalse(manager.remove(user));

        assertEquals(0, manager.getAll().size());
    }

    // remove() negative: удалить несуществующий элемент из коллекции
    @Test
    public void shouldRemoveNotExistingElementFromList() {
        Entity user1 = new User("Bob", 38, true);
        Entity user2 = new User("Bob", 38, true);

        manager.add(user1);

        assertFalse(manager.remove(user2));

        assertFalse(manager.getAll().contains(user2));
        assertTrue(manager.getAll().contains(user1));
        assertEquals(1, manager.getAll().size());
    }

    // remove() negative: удалить null
    @Test
    public void shouldRemoveNullFromList() {
        assertFalse(manager.remove(null));
    }

    // getAll(): возвращаемый список нельзя изменить
    @Test
    public void returnedListCannotBeChange() {
        Entity user = new User("Bob", 23, true);
        manager.add(user);

        List<Entity> list = manager.getAll();

        assertThrows(
                UnsupportedOperationException.class,
                () -> list.remove(user)
        );

        assertTrue(manager.getAll().contains(user));
    }

    // getAll(): вернуть пустой список
    @Test
    public void shouldReturnEmptyListWhenManagerHasNotElements() {
        List<Entity> list = manager.getAll();

        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    // filterByAge(): обычный диапазон (от 20 до 30)
    @Test
    public void checkNormalRange() {
        Entity user1 = new User("Bob", 20, true);
        Entity user2 = new User("Alice", 25, true);
        Entity user3 = new User("Maria", 35, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<Entity> users = manager.filterByAge(20, 30);

        assertEquals(2, users.size());
        assertTrue(users.contains(user1));
        assertTrue(users.contains(user2));
        assertFalse(users.contains(user3));
    }

    // filterByAge(): диапазон, в который попадает только 1 элемент
    @Test
    public void ageRangeThatOnlyContainsOneElement() {
        Entity user1 = new User("Bob", 18, true);
        Entity user2 = new User("Alice", 30, true);
        Entity user3 = new User("Maria", 45, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<Entity> users = manager.filterByAge(18, 20);

        assertEquals(1, users.size());
        assertTrue(users.contains(user1));
    }

    // filterByAge(): диапазон, в который все не попадают
    @Test
    public void ageRangeThatDoesntIncEveryone() {
        Entity user1 = new User("Bob", 18, true);
        Entity user2 = new User("Alice", 30, true);
        Entity user3 = new User("Maria", 45, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<Entity> users = manager.filterByAge(50, 65);

        assertEquals(0, users.size());
    }

    // filterByAge(): граничное значение
    @Test
    public void ageRangeCutoffValue() {
        Entity user1 = new User("Bob", 18, true);
        Entity user2 = new User("Alice", 30, true);
        Entity user3 = new User("Maria", 45, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<Entity> users = manager.filterByAge(18, 45);

        assertEquals(3, users.size());
    }

    // filterByName(): есть юзер с именем Alice
    @Test
    public void shouldReturnListWithSpecificName() {
        Entity user1 = new User("Bob", 29, true);
        Entity user2 = new User("Alice", 29, true);
        Entity user3 = new User("Maria", 29, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<Entity> users = manager.filterByName("Alice");

        assertTrue(users.contains(user2));
        assertEquals(1, users.size());
    }

    // filterByName(): есть юзер с одинаковыми именами
    @Test
    public void shouldReturnListWithIdenticalNames() {
        Entity user1 = new User("Bob", 29, true);
        Entity user2 = new User("Bob", 29, true);
        Entity user3 = new User("Alice", 29, true);
        Entity user4 = new User("Alice", 29, true);
        Entity user5 = new User("Maria", 29, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);
        manager.add(user4);
        manager.add(user5);

        List<Entity> users = manager.filterByName("Bob");
        List<Entity> users1 = manager.filterByName("Alice");

        assertTrue(users.contains(user1));
        assertTrue(users.contains(user2));
        assertEquals(2, users.size());

        assertTrue(users1.contains(user3));
        assertTrue(users1.contains(user4));
        assertEquals(2, users.size());
    }

    // filterByName(): юзер с таким именем не был найден
    @Test
    public void shouldReturnEmptyListWhenUserWithNameNotFound() {
        Entity user1 = new User("Bob", 29, true);
        Entity user2 = new User("Alice", 29, true);
        Entity user3 = new User("Maria", 29, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<Entity> users = manager.filterByName("Jack");

        assertTrue(users.isEmpty());
    }

    // filterByName(): список пуст
    @Test
    public void shouldReturnEmptyList() {
        List<Entity> users = manager.filterByName("Bob");

        assertTrue(users.isEmpty());
    }

    // filterByActive(): активный юзер
    @Test
    public void shouldReturnListWhenUserIsActive() {
        Entity user1 = new User("Bob", 29, true);
        Entity user2 = new User("Alice", 29, false);
        Entity user3 = new User("Maria", 29, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<Entity> users = manager.filterActive(true);

        assertTrue(users.contains(user1));
        assertTrue(users.contains(user3));

        assertEquals(2, users.size());
    }

    // filterByActive(): НЕактивный юзер
    @Test
    public void shouldReturnListWhenUserNotIsActive() {
        Entity user1 = new User("Bob", 29, true);
        Entity user2 = new User("Alice", 29, false);
        Entity user3 = new User("Maria", 29, true);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<Entity> users = manager.filterActive(false);

        assertTrue(users.contains(user2));
        assertEquals(1, users.size());
    }

    // filterByActive(): пустой лист
    @Test
    public void shouldReturnEmptyListWithoutUsers() {
        List<Entity> users = manager.filterActive(true);

        assertTrue(users.isEmpty());
    }
}
