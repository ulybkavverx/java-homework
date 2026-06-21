package homework.test_5.botanical_garden;

public class Main {
    /**
     * Ботанический сад
     * В ботаническом саду содержится одно растение.
     * У разных растений — разные требования к уходу.
     * Примеры:
     * Орхидея — высокая влажность и тень
     * Кактус — много света, редкий полив
     * Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.
     *
     * Сущности:
     * Plant: Orchid, Cactus, BotanicalGarden
     * Св-ва, действия, связи
     * Plant - св-в нет
     *       care()
     * Orchid - св-в нет
     *        care() - необходимость в высокой влажности и тени
     * Cactus - св-в нет
     *        care() - много света и редкий полив
     * BotanicalGarden - Plant
     *                  setPlant()
     *                  providingCareForPlant()
     * Наследование:
     * Plant <- Orchid, Cactus
     * Полиморфизм: care()
     * Ассоциация: BotanicalGarden -> Plant
     * Абстрактный класс: наследование + полиморфизм
     * Интерфейс: полиморфизм
     *
     */
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        Plant orchid = new Orchid();
        Plant cactus = new Cactus();

        botanicalGarden.setPlant(orchid);
        botanicalGarden.providingCareForPlant();

        botanicalGarden.setPlant(cactus);
        botanicalGarden.providingCareForPlant();
    }
}
