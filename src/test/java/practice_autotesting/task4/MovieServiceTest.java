package practice_autotesting.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    private MovieService movieService;

    @BeforeEach
    public void setup() {
        movieService = new MovieService();
    }

    // addRating() : добавить оценку к фильму
    @Test
    public void shouldAddRatingToMovie() {
        Movie movie = new Movie("1+1", 2011);
        Rating<Number> rating = new Rating<>(9);

        movieService.addRating(movie, rating);

        assertEquals(9, movieService.averageRating(movie));
    }

    // addRating() : добавить отрицательную оценку к фильму и больше 10
    @ParameterizedTest
    @ValueSource(ints = {-1, 11})
    public void shouldThrowExceptionWhenRatingIsOutOfRange(int ratingValue) {
        Movie movie = new Movie("1+1", 2011);
        Rating<Number> rating = new Rating<>(ratingValue);

        assertThrows(
                InvalidRatingException.class,
                () -> movieService.addRating(movie, rating)
        );
    }

    // addRating() : граничные значения 1 и 10
    @ParameterizedTest
    @ValueSource(ints = {1, 10})
    public void shouldAddRating1And10(int ratingValue) {
        Movie movie = new Movie("1+1", 2011);
        Rating<Number> rating = new Rating<>(ratingValue);

        assertDoesNotThrow(
                () -> movieService.addRating(movie, rating)
        );
    }

    // average(): одна оценка
    @Test
    public void shouldReturnRatingWhereHasOneRating() {
        Movie movie = new Movie("1+1", 2011);

        movieService.addRating(movie, new Rating<>(7));

        assertEquals(7, movieService.averageRating(movie));
    }

    // average(): несколько оценок
    @Test
    public void shouldCalculateAvgRating() {
        Movie movie = new Movie("1+1", 2011);

        movieService.addRating(movie, new Rating<>(8));
        movieService.addRating(movie, new Rating<>(10));
        movieService.addRating(movie, new Rating<>(3));

        assertEquals(7, movieService.averageRating(movie));
    }

    // average(): разные фильмы
    @Test
    public void shouldCalculateAvgOnlyForRequestMovie() {
        Movie movie1 = new Movie("1+1", 2011);
        Movie movie2 = new Movie("Interstellar", 2015);

        movieService.addRating(movie1, new Rating<>(8));
        movieService.addRating(movie1, new Rating<>(9));

        movieService.addRating(movie2, new Rating<>(2));

        assertEquals(8.5, movieService.averageRating(movie1));
    }

    // sorted() : сортировка от большей оценки к меньшей
    @Test
    public void shouldSortMovieByAvgRatingDescending() {
        Movie movie1 = new Movie("1+1", 2011);
        Movie movie2 = new Movie("Interstellar", 2015);
        Movie movie3 = new Movie("Titanic", 1996);

        movieService.addRating(movie1, new Rating<>(7));
        movieService.addRating(movie2, new Rating<>(10));
        movieService.addRating(movie3, new Rating<>(5));

        List<Movie> sortedMovies = movieService.sortMovieByRating();

        assertEquals(
                List.of(movie2, movie1, movie3),
                sortedMovies
        );
    }

    // sorted() : сортировка с учетом среднего значения
    @Test
    public void shouldSortMoviesByAvgRating() {
        Movie movie1 = new Movie("1+1", 2011);
        Movie movie2 = new Movie("Interstellar", 2015);

        movieService.addRating(movie1, new Rating<>(6));
        movieService.addRating(movie1, new Rating<>(8));

        movieService.addRating(movie2, new Rating<>(10));
        movieService.addRating(movie2, new Rating<>(2));

        List<Movie> sortedMovies = movieService.sortMovieByRating();

        assertEquals(
                List.of(movie1, movie2),
                sortedMovies
        );
    }
}
