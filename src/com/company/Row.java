package com.company;

public  final class Row<RowData> {
    private final Long id;

    public Row(Long id) {
        this.id = id;
    }

    public Long getPrimaryId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Row)) return false;

        Row<?> row = (Row<?>) o;

        return id.equals(row.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
