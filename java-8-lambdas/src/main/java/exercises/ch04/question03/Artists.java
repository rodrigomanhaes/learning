package exercises.ch04.question03;

import java.util.List;
import java.util.Optional;

import model.Artist;

public class Artists {
    private final List<Artist> artists;

    public Artists(final List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> artist(final int index) {
        return index >= 0 && index < artists.size() ?
            Optional.of(artists.get(index)) : Optional.empty();
    }

    public Optional<String> artistName(final int index) {
        return Optional.of(artist(index).get().name());
    }
}
