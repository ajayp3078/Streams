package PracticeStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AskedQuestions {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1,"ajay",50),
                new Student(2,"vishal",32),
                new Student(3,"kalyan",16),
                new Student(4,"manish",76),
                new Student(5,"sangeet",75)
        );

        // filter students whose marks are greater than 40 and increase marks by 5 whose marks are greater than 75 and return a list
        List<Student> list = students.stream().filter(x -> x.getMarks() > 40)
                .map(x -> {
                    int updatedMarks = x.getMarks() >= 75 ? x.getMarks() + 5 : x.getMarks();
                    return new Student(x.getId(), x.getName(), updatedMarks);
                }).toList();

        // order of execution of sql
        // from , where , group by, having , select, order by, limit



    }
}
