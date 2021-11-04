package Streams;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
       
        //Integer Stream
        /*System.out.println(
        IntStream
            .range(1,10)
            //.skip(5)
            .sum());
            //.forEach(x -> System.out.println(x));
        System.out.println();
       */
    /*k  Stream.of("henry", "alese", "greg")
        .sorted()
        .findFirst()
        .ifPresent(System.out::println);
        String[] names = {"alan", "sean", "john", "smith"};
        Arrays.stream(names)
            .filter(x -> x.startsWith("s"))
            .sorted()
            .forEach(System.out::println);

           Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

            List<String> people = Arrays.asList("al", "ankit", "amanda"
                                              ,"hans", "sarika");
                people
                    .stream()
                    .map(String::toLowerCase)
                    .filter(x -> x.startsWith("a"))
                    .forEach(System.out::println);
            */
            double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
            System.out.println("Total = " + total);

            IntSummaryStatistics summary = IntStream.of(7,2,3,5,6,7,8)
                .summaryStatistics();

            System.out.println(summary.getAverage());


    }
}
