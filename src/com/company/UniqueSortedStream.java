package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public final class UniqueSortedStream {
    private UniqueSortedStream() {
    }

    public static <T> Stream<Row<T>> uniqueRowsSortedByPK(Stream<Row<T>> stream) {
        return stream.distinct();
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(3);
        list.add(4);

        list.stream().filter(Objects::nonNull).forEach(System.out::println);

    }
}
