package Codes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static boolean hasCountGreaterThanOne(Map.Entry<?,Long>entry){
        return entry.getValue()>1;
    }

    public static void findDuplicatesUsingStreams(int[] arr){
        List<Integer> duplicates = Arrays.stream(arr).mapToObj(x -> (int) x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(FindDuplicates::hasCountGreaterThanOne).map(Map.Entry::getKey).toList();
        System.out.println("Using streams: " + duplicates);
    }
    public static void findDuplicatesUsingHashSet(int[] arr){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates using Set: " + duplicates);
    }
    public static void findDuplicatesUsingNestedForLoops(int[] arr){
        System.out.println("Using nested for loops: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,5,3,5,6};
        findDuplicatesUsingStreams(arr);
        findDuplicatesUsingHashSet(arr);
        findDuplicatesUsingNestedForLoops(arr);
    }
}
