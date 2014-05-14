package exercises.ch03.question01;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.stream.*;

import model.Album;
import model.Artist;

public class CommonStreamOperations {
    public static Integer addUp(final Stream<Integer> numbers) {
        return numbers.reduce((a, b) -> a + b).get();
    }

    public static List<String> namesAndPlaces(final List<Artist> artists) {
        return artists.stream()
            .map(artist -> artist.name() + ", " + artist.origin())
            .collect(toList());
    }

    public static List<Album> albumsWithAtMostTracks(
        final Integer maxTrackCount, final List<Album> allAlbums) {
        return allAlbums.stream()
            .filter(album -> album.trackCount() <= maxTrackCount)
            .collect(toList());
    }
}
