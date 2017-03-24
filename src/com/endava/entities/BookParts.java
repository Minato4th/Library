package com.endava.entities;

/**
 * 3/24/2017
 */
public abstract class BookParts {

    private String part;

    public BookParts(String part) {
        this.part = part;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "BookParts{" +
                "part='" + part + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookParts)) return false;

        BookParts bookParts = (BookParts) o;

        return part != null ? part.equals(bookParts.part) : bookParts.part == null;

    }

    @Override
    public int hashCode() {
        return part != null ? part.hashCode() : 0;
    }
}
