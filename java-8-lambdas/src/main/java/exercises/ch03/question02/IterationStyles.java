package exercises.ch03.question02;

import java.util.List;
import java.util.stream.Stream;

import model.Artist;

public class IterationStyles {
    public static Integer externalMembersCount(final List<Artist> artists) {
        int totalMembers = 0;
        for (final Artist artist: artists) {
            final Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        return totalMembers;
    }

    public static Long internalMembersCount(final List<Artist> artists) {
        return artists.stream()
            .flatMap(artist -> artist.getMembers())
            .count();
    }
}
