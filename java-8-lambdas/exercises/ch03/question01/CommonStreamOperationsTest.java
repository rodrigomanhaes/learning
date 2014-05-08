package question01;

import static java.util.Arrays.asList;
import static model.test.Factory.albumWithTracks;
import static org.junit.Assert.assertEquals;
import static question01.CommonStreamOperations.addUp;
import static question01.CommonStreamOperations.albumsWithAtMostTracks;
import static question01.CommonStreamOperations.namesAndPlaces;

import java.util.stream.Stream;

import model.Album;
import model.Artist;

import org.junit.Test;

public class CommonStreamOperationsTest {
    @Test
    public void addUpNumbers() {
        assertEquals(new Integer(10), addUp(Stream.of(1, 2, 3, 4)));
    }

    @Test
    public void artistsNamesAndPlacesOfOrigin() {
        assertEquals(
            asList("The Beatles, Liverpool", "Nirvana, Seattle",
                   "Chico Buarque, Rio de Janeiro"),
            namesAndPlaces(asList(
               new Artist("The Beatles", "Liverpool"),
               new Artist("Nirvana", "Seattle"),
               new Artist("Chico Buarque", "Rio de Janeiro")))
        );
    }

    @Test
    public void albumsWithAtMostThreeTracks() {
        final Album album2 = albumWithTracks(2), album3 = albumWithTracks(3),
          album4 = albumWithTracks(4);
        assertEquals(
            asList(album2, album3),
            albumsWithAtMostTracks(3, asList(album2, album3, album4)));

    }
}
