package home_work_6.api;

public interface ISearchEngine {
    /**
     * Метод возвращает информации о количестве раз повторений слова в тексте.
     * @param text - текст, в котором ищем слово
     * @param word - слово, которое ищем
     * @return - возвращает количество повторений слова
     */
    long search(String text, String word);
}
