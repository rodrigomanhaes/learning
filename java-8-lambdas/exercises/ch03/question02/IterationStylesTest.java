package ch03.question02;

import static model.test.ArtistFactory.engenheirosDoHawaii;
import static model.test.ArtistFactory.nirvana;
import static model.test.ArtistFactory.theBeatles;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import model.Artist;

import org.junit.Before;
import org.junit.Test;

public class IterationStylesTest {
    private List<Artist> artists;

    @Before
    public void createArtists() {
        artists = Arrays.asList(nirvana(), theBeatles(), engenheirosDoHawaii());
    }

    @Test
    public void externalIteration() {
        assertEquals(new Integer(10), IterationStyles.externalMembersCount(artists));
    }

    @Test
    public void internalIteration() {
        assertEquals(new Long(10), IterationStyles.internalMembersCount(artists));
    }
}
