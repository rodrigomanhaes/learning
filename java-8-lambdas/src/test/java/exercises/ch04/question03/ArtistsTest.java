package exercises.ch04.question03;

import static org.junit.Assert.*;
import static model.ArtistFactory.*;
import static java.util.stream.Collectors.*;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import model.Artist;

import org.junit.Before;
import org.junit.Test;

public class ArtistsTest {
    private static List<Artist> artistList = Stream.of(
        nirvana(), theBeatles()).collect(toList());

    private Artists artists;

    @Before
    public void makeArtists() {
        artists = new Artists(artistList);
    }

    @Test
    public void providesArtistByIndex() {
        assertThat(artists.artist(0), equalTo(Optional.of(nirvana())));
        assertThat(artists.artist(1), equalTo(Optional.of(theBeatles())));
        assertThat(artists.artist(2), is(Optional.empty()));
    }
}
