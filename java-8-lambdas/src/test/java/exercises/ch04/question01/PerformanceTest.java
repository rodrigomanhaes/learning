package exercises.ch04.question01;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import model.Artist;
import static model.ArtistFactory.*;

import org.junit.Test;

public class PerformanceTest {
    class PerformanceImpl implements Performance {
        private final List<Artist> musicians;

        public PerformanceImpl() {
            musicians = new ArrayList<>();
            musicians.add(nirvana());
            musicians.add(theBeatles());
        }

        public String getName() { return null; }

        public Stream<Artist> getMusicians() {
            return musicians.stream();
        }
    }


    @Test
    public void returnsAllMusicians() {
        final List<Artist> allMusicians = new ArrayList<>();
        allMusicians.add(nirvana());
        allMusicians.add(theBeatles());
        nirvana().getMembers().forEach(member -> allMusicians.add(member));
        theBeatles().getMembers().forEach(member -> allMusicians.add(member));
        assertThat(new PerformanceImpl().getAllMusicians().collect(toList()),
            containsInAnyOrder(allMusicians.toArray(new Artist[] {})));
    }

}
