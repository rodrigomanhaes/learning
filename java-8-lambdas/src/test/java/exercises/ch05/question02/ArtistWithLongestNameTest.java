package exercises.ch05.question02;

import static org.junit.Assert.*;

import java.util.stream.Stream;

import org.junit.Test;

public class ArtistWithLongestNameTest {

    @Test
    public void findArtistWithLongestName() {
        assertEquals("Stuart Sutcliffe", ArtistWithLongestName.find(
            Stream.of("John Lennon", "Paul McCartney", "George Harrison",
                      "Ringo Starr", "Pete Best", "Stuart Sutcliffe")));
    }

}
