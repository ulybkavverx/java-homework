package homework.test_5.museum;

public class Main {
    /**
     * Музей
     * В музее выставлен экспонат.
     * У каждого экспоната своя история и условия хранения.
     * Примеры:
     * Манускрипт — требует контролируемой влажности
     * Скульптура — нуждается в реставрации
     * Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.
     *
     * Сущности - Exhibit: Manuscript, Sculpture, Museum
     * Св-ва, действия, связи:
     * Exhibit - нет св-в
     *          история - describe()
     *          условие хранения - preserve()
     * Manuscript - нет св-в
     *            describe() - древний текст
     *            preserve() - контролируемая влажность
     * Sculpture - нет св-в
     *           describe() - скульптурный объект
     *           preserve() - нужда в реставрации
     * Museum - Exhibit
     *         setExhibit()
     *         showExhibit()
     * Наследование:
     * Exhibit <- Manuscript, Sculpture
     * Полиморфизм:
     * describe(), preserve()
     * Ассоциация:
     * Museum -> Exhibit
     * Абстрактный класс: наследование + полиморфизм
     * Интерфейс: полиморфизм
     */
    public static void main(String[] args) {
        Museum museum = new Museum();

        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        museum.setExhibit(manuscript);
        museum.showExhibit();

        museum.setExhibit(sculpture);
        museum.showExhibit();
    }
}
