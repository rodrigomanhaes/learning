package model;

import model.Artist;

public class ArtistFactory {
    private static Artist nirvana, theBeatles, engenheirosDoHawaii;

    public static Artist nirvana() {
        if (nirvana == null)
            nirvana = create("Nirvana", "Seattle", "Kurt Cobain", "Dave Grohl",
                             "Krist Novoselic");
        return nirvana;
    }

    public static Artist theBeatles() {
        if (theBeatles == null)
            theBeatles = create("The Beatles", "Liverpool", "John Lennon",
                                "Paul McCartney", "George Harrison",
                                "Ringo Starr");
        return theBeatles;
    }

    public static Artist engenheirosDoHawaii() {
        if (engenheirosDoHawaii == null)
          engenheirosDoHawaii = create("Engenheiros do Hawaii", "Porto Alegre",
                "Humberto Gessinger", "Augusto Licks", "Carlos Maltz");
        return engenheirosDoHawaii;
    }

    private static Artist create(final String name, final String origin,
            final String... memberNames) {
        final Artist artist = new Artist(name, origin);
        for (final String memberName: memberNames)
            artist.addMember(new Artist(memberName));
        return artist;
    }
}
