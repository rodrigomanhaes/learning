package model;

import model.Artist;

public class ArtistFactory {
    public static Artist nirvana() {
        return create("Nirvana", "Seattle", "Kurt Cobain", "Dave Grohl",
                "Krist Novoselic");
    }

    public static Artist theBeatles() {
        return create("The Beatles", "Liverpool", "John Lennon",
                "Paul McCartney", "George Harrison", "Ringo Starr");
    }

    public static Artist engenheirosDoHawaii() {
        return create("Engenheiros do Hawaii", "Porto Alegre",
                "Humberto Gessinger", "Augusto Licks", "Carlos Maltz");
    }

    private static Artist create(final String name, final String origin,
            final String... memberNames) {
        final Artist artist = new Artist(name, origin);
        for (final String memberName: memberNames)
            artist.addMember(new Artist(memberName));
        return artist;
    }
}
