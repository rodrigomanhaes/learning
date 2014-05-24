package exercises.ch05.question02;

import static org.junit.Assert.*;
import static model.ArtistFactory.*;
import static java.util.Arrays.*;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import model.Artist;

import org.junit.Test;

public class CustomCollectorTest {

    @Test
    public void groupingBy() {
        assertEquals(
            new HashMap<String, List<Artist>>() {{
                put("Liverpool", asList(theBeatles()));
                put("Seattle", asList(nirvana(), aliceInChains()));
            }},
            Stream.of(nirvana(), theBeatles(), aliceInChains())
                .collect(CustomCollector.groupingBy(artist -> artist.origin()))
        );
    }

}
