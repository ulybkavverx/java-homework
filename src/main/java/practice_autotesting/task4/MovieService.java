package practice_autotesting.task4;

/*
MovieService - менеджер, управление фильмами и их рейтингами
Movie - поля: название фильма, др характеристики
Rating<T extends Number> - хранение рейтинга фильма
 */

import java.util.*;

public class MovieService {
    // хранение оценок - Мар<Movie, List<Rating>>
    private final Map<Movie, List<Rating<? extends Number>>> ratings = new HashMap<>();

    // метод для добавления оценки к фильму(потокобезопасный), валидация от 1 до 10
    public synchronized void addRating(Movie movie, Rating<? extends Number> rating) {

        double value = rating.getRating().doubleValue();

        if (value < 1 || value > 10) {
            throw new InvalidRatingException("Rating must be between 1 and 10");
        }

        ratings
                .computeIfAbsent(movie, key -> new ArrayList<>())
                .add(rating);
    }

    // метод для расчета средней оценки для каждого фильма (stream)
    public double averageRating(Movie movie) {

        List<Rating<? extends Number>> movieRatings = ratings.get(movie);

        if (movieRatings == null) {
            return 0;
        }

        return movieRatings.stream()
                .mapToDouble(rating -> rating.getRating().doubleValue())
                .average()
                .orElse(0);
    }

    // сортировка фильмов по средней оценке (stream)
    public List<Movie> sortMovieByRating() {
        return ratings.keySet()
                .stream()
                .sorted(
                        Comparator.comparingDouble(
                                this::averageRating
                        )
                                .reversed()
                )
                .toList();
    }
}
