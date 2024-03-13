package org.javaeight.streams;

import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //stream example 1
        Stream<Integer> stream= Stream.of(1,2,3,4,5,6);
        List<Integer> res = stream
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .sorted((o1, o2) -> o2.compareTo(o1))
                .toList();
        System.out.println(res);
    }
}

