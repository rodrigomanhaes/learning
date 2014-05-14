package model;

import java.util.ArrayList;
import java.util.List;

import model.Album;
import model.Track;

public class Factory {
    public static List<Track> tracks(final Integer count) {
        final List<Track> tracks = new ArrayList<>();
        for (int i = 1; i <= count; i++)
            tracks.add(new Track());
        return tracks;
    }

    public static Album albumWithTracks(final Integer trackCount) {
        return new Album(tracks(trackCount));
    } 
}
