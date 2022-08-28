package a_b5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenAndOddNoUsingStreamApi {
    public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,4,9,2,4,6,7,19,45,77,88,33,14,22,20,60);
		List<Integer> even = num.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(even);
		List<Integer> odd = num.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(odd);
	}
}
