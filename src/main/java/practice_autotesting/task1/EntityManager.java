package practice_autotesting.task1;

/*
Сущности:
EntityManager - сущность, управляющая коллекцией объектов типа Т
Entity - сущность(абстрактная), есть поля: age, name, isActive
User - конкретный объект, наследник Entity
 */

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    // хранение элементов - потокобезопасная коллекция
    private final List<T> entities = new CopyOnWriteArrayList<>();

    // добавление элементов - потокобезопасный
    public void add(T entity) {
        entities.add(entity);
    }

    // удаление элементов - return true, если объект был удален, false, если объект не найден (потокобезопасный)
    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    // получение всех элементов - return копию списка вех элементов
    public List<T> getAll() {
        return List.copyOf(entities);
    }

    // фильтрация по имени - return список юзеров, чьи имена соответствуют заданной строке
    public List<T> filterByName(String name) {
        return entities.stream()
                .filter(entity -> entity.getName().equals(name))
                .collect(Collectors.toList());
    }

    // фильтрация по возрасту - return список юзеров в заданном возрастном диапазоне
    public List<T> filterByAge(int min, int max) {
        return entities.stream()
                .filter(entity -> entity.getAge() >= min && entity.getAge() <= max)
                .collect(Collectors.toList());
    }

    // фильтрация по активности - return список юзеров с заданным статусом активности
    public List<T> filterActive(boolean isActive) {
        return entities.stream()
                .filter(entity -> entity.isActive() == isActive)
                .collect(Collectors.toList());
    }
}
