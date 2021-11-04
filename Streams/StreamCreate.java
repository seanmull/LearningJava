package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreate {

    public static void main(String[] args) {

        Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 1000000), new Employee(2, "Bill Gates", 2000000),
                new Employee(3, "Mark Z", 140000) };

        List<Integer> sumOfMoney = Arrays.stream(arrayOfEmps)
                .map(Employee -> Employee.money)
                .collect(Collectors.toList());
       sumOfMoney.forEach(System.out::println);


        Integer sum = Arrays.stream(arrayOfEmps)
                .map(Employee -> Employee.money)
                .reduce(0, (accumulator, combiner) -> accumulator + combiner);

        System.out.println(sum);                

        List<String> sortByName = Arrays.stream(arrayOfEmps)
                .map(Employee::getName)
                .sorted()
                .filter(name -> name == "Jeff Bezos")
                .collect(Collectors.toList());
        sortByName.forEach(System.out::println);

        
    }

}
