package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Artist {
    private final String name, origin;
    private final List<Artist> members;

    public Artist(final String name, final String origin) {
        this.name = name;
        this.origin = origin;
        this.members = new ArrayList<>();
    }

    public Artist(final String name) {
        this(name, null);
    }

    public String name() {
        return name;
    }

    public String origin() {
        return origin;
    }

    public void addMember(final Artist member) {
        members.add(member);
    }

    public Stream<Artist> getMembers() {
        return members.stream();
    }
}
