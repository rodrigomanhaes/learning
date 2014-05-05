package model;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private final List<Track> tracks;

    public Album(final List<Track> tracks) {
        this.tracks = new ArrayList<>(tracks);
    }

    public Integer trackCount() {
        return tracks.size();
    }
}
