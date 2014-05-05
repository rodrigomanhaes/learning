package model;

public class Artist {
    private final String name, origin;

    public Artist(final String name, final String origin) {
        this.name = name;
        this.origin = origin;
    }

    public String name() {
        return name;
    }

    public String origin() {
        return origin;
    }
}
