package a_b5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbersUsingStreamApi {
     public static void main(String[] args) {
		List<Integer> num=Arrays.asList(71,54,26,48,96,13,47,55,33,17,94,45);
		List<Integer> sort = num.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
	}
}
