package org.gs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MovieTest {

    private Movie movie;

    @BeforeEach
    void init() {
        movie = Movie.builder().id(1L).title("MyMovie").description("MyFirstMovie").director("Me").country("US")
                .build();
    }

    @Test
    void testId() {
        assertNotNull(movie);
        assertEquals(1L, movie.getId());
        movie.setId(2L);
        assertEquals(2L, movie.getId());
    }

    @Test
    void testTitle() {
        assertNotNull(movie);
        assertEquals("MyMovie", movie.getTitle());
        movie.setTitle("MyMovieUpdate");
        assertEquals("MyMovieUpdate", movie.getTitle());
    }

    @Test
    void testDescription() {
        assertNotNull(movie);
        assertEquals("MyFirstMovie", movie.getDescription());
        movie.setDescription("MyFirstMovieUpdated");
        assertEquals("MyFirstMovieUpdated", movie.getDescription());
    }

    @Test
    void testCountry() {
        assertNotNull(movie);
        assertEquals("US", movie.getCountry());
        movie.setCountry("UK");
        assertEquals("UK", movie.getCountry());
    }

    @Test
    void testDirector() {
        assertNotNull(movie);
        assertEquals("Me", movie.getDirector());
        movie.setDirector("You");
        assertEquals("You", movie.getDirector());
    }

}
