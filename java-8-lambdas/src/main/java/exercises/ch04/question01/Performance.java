package exercises.ch04.question01;

import java.util.stream.Stream;

import model.Artist;

public interface Performance {
    String getName();
    Stream<Artist> getMusicians();

    default Stream<Artist> getAllMusicians() {
        return getMusicians()
            .flatMap(artist -> Stream.concat(Stream.of(artist), artist.getMembers()));
    }
}
