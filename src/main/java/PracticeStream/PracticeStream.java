package PracticeStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1Jaya","Ajay2","456");

        // 1) remove non numeric
        List<String> result = list.stream().map(x -> x.replaceAll("[a-zA-Z]+", "")).toList();
        System.out.println(result);

        // 2) only digits
        List<String> onlyDigits = list.stream().filter(x -> x.matches("\\d+")).toList();
        System.out.println(onlyDigits);

        List<Integer> nums = Arrays.asList(1,1,2,2,2,3,4,5,7,7,7);
        Map<Integer, Long> map = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // get min freq
        Long minFreq = map.entrySet().stream().map(x -> x.getValue()).min(Comparator.naturalOrder()).get();
        System.out.println(minFreq);

        // 3) find the lowest freq element
        List<Integer> lowestFreqElem = map.entrySet().stream().filter(x -> x.getValue() == minFreq).map(x -> x.getKey()).toList();
        System.out.println(lowestFreqElem);

        // 4) kth largest element
        int k=4;
        Integer kthLargest = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(k - 1).findFirst().get();
        System.out.println(kthLargest);

        // 5) highest freq elements
        Map<Integer, Long> elements = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // find Max Freq
        Long maxFreq = elements.entrySet().stream().map(Map.Entry::getValue).max(Comparator.naturalOrder()).get();
        // find elements with highest freq
        List<Integer> results = elements.entrySet().stream().filter(x -> x.getValue() == maxFreq).map(Map.Entry::getKey).toList();
        System.out.println(results);

        // 6) kth smallest
        int a=3;
        Integer min = nums.stream().distinct().sorted().skip(a - 1).findFirst().get();
        System.out.println(min);

        // 7) check whether list in asc ?
        boolean isTrue = nums.stream().sorted().toList().equals(nums);
        System.out.println(isTrue);

        // 8) find strings with min length
        List<String> city = Arrays.asList("Mumbai","Pune","Lone");
        Integer mini = city.stream().map(String::length).min(Comparator.naturalOrder()).get();
        List<String> minLengthStr = city.stream().filter(x -> x.length() == mini).toList();
        System.out.println(minLengthStr);

        // incomplete logic
        String res = city.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println(res);

        // 9) String with specific substr
        String str = "ay";
        List<String> names = Arrays.asList("Ajay","Jaya","Ramesh");
        List<String> ans = names.stream().filter(x -> x.contains(str)).toList();
        System.out.println(ans);

        // 10) Remove whitespaces
        List<String> fruits = Arrays.asList("app le","ba  nana ","chi ckoo");
        List<String> list1 = fruits.stream().map(x -> x.replaceAll("\\s", "")).toList();
        System.out.println(list1);

        // 11) diff between max and min
        Integer max = nums.stream().max(Comparator.naturalOrder()).get();
        Integer minimum = nums.stream().min(Comparator.naturalOrder()).get();
        System.out.println(max-minimum);

        // 12) check for same length
        List<String> object = Arrays.asList("Table","Chair");
        boolean b = object.stream().map(String::length).distinct().count() == 1;
        System.out.println(b);

        // 13) ** find str with duplicate chars
        List<String> duplicateChars = Arrays.asList("hello","ajay","pune");
        List<String> findStrDup = duplicateChars.stream().filter(x -> Arrays.stream(x.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().anyMatch(count -> count > 1)).toList();
        System.out.println(findStrDup);

        // 14) find union
        List<Integer> num1 = Arrays.asList(1,2,3,4,4,5);
        List<Integer> num2 = Arrays.asList(4,4,6,7,7,8,9);

        List<Integer> union = Stream.concat(num1.stream(), num2.stream()).toList();
        System.out.println(union);

        // 15) find intersection
        List<Integer> intersection = num1.stream().filter(x -> num2.contains(x)).toList();
        System.out.println(intersection);

        // 16) ** find index of first occurrence of number
        int num = 4;
        int asInt = IntStream.range(0, num1.size()).filter(x -> num1.get(x) == num).findFirst().getAsInt();
        System.out.println(asInt);

        // 17) List of string to comma separated string
        String ans1 = duplicateChars.stream().collect(Collectors.joining(","));
        System.out.println(ans1);

        // 18) strings with vowels only
        List<String> string = Arrays.asList("aei","ajay","oui");
        List<String> vowels = string.stream().filter(x -> x.matches("[aeiouAEIOU]+")).toList();
        System.out.println(vowels);

        // 19) sum of all odd numbers
        int sum = nums.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        // 20) remove null values
        List<String> stringNull = Arrays.asList(null,"ajay","jaya",null);
        List<String> nonNull = stringNull.stream().filter(x -> x != null).toList();
        System.out.println(nonNull);

        // 21) reverse list
        Collections.reverse(string);
        System.out.println(string);

        // 22) string with max length
        String maxLengthString = string.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(maxLengthString);

        // 23) print strings greater than specific length
        int length = 2;
        List<String> res2 = string.stream().filter(x -> x.length() > length).toList();
        System.out.println(res2);

        // 24) check if list contains specific string
        List<String> objects = Arrays.asList("Car","Pen","Pencil","Box");
        Boolean matches = objects.stream().anyMatch(x -> x.matches("Pen"));
        System.out.println(matches);

        // 25) find product
        Integer product = nums.stream().reduce((x, y) -> x * y).get();
        System.out.println(product);

        // 26) starting with prefix
        List<String> prefix = objects.stream().map(String::toLowerCase).filter(x -> x.startsWith("p")).toList();
        System.out.println(prefix);

        // 27) convert to squares
        List<Integer> squares = nums.stream().map(x -> x * x).toList();
        System.out.println(squares);

        // 28) shortest string
        String minLengthString = objects.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println(minLengthString);

        Integer minLength = objects.stream().map(String::length).min(Comparator.naturalOrder()).get();
        List<String> stringList = objects.stream().filter(x -> x.length() == minLength).toList();
        System.out.println(stringList);

        // 29) second largest number
        Integer secondLargest = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);

        // 30) Longest string
        String longest = objects.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longest);

        // 31) Concatenate all
        String concatenateAll = objects.stream().collect(Collectors.joining("+"));
        System.out.println(concatenateAll);

        // 32) sort alphabetically
        List<String> asc = objects.stream().sorted().toList();
        List<String> desc = objects.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(asc);
        System.out.println(desc);

        // 33) calculate average
        double average = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);

        // 34) toUpperCase
        List<String> upperCase = objects.stream().map(String::toUpperCase).toList();
        System.out.println(upperCase);

        // 35) count number of strings containing specific character
        char c = 'a';
        List<String> counts = objects.stream().filter(x -> x.contains(String.valueOf(c))).toList();
        long count = objects.stream().filter(x -> x.contains(String.valueOf(c))).count();
        System.out.println(counts);
        System.out.println(count);

        // 36)

    }
}
