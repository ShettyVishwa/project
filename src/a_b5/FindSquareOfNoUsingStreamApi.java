package a_b5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSquareOfNoUsingStreamApi {
     public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,3,2,4,6,7,8,9,11,15,26,34,49,56);
		List<Integer> square = num.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
	}
}
