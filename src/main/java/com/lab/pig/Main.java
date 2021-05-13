package com.lab.pig;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {
        Stream.of(Util.getPig())
                .filter(p -> p.getAddr().contains("桃園"))
                .forEach(System.out::println);

        List badpig = Stream.of(Util.getPig())
                .filter(p -> p.getAddr().contains("桃園"))
                .collect(toList());
        System.out.printf("合格: %s, 內容: %s\n", badpig.size(), badpig);
    }

}
