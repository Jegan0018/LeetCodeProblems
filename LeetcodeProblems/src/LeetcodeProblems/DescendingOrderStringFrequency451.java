package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DescendingOrderStringFrequency451 {
	public static void main(String[] args) {
		int[] array= {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) {
			if(map.containsKey(array[i])==false) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i])+1);
			}
		}
		System.out.println(map);
		Map<Integer,Integer> object=new HashMap<Integer,Integer>();
		List<Integer> list=new ArrayList<Integer>();
		int[] result=new int[array.length];
		int index=0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			int num=entry.getValue();
			int value=entry.getKey();
			
			for(int i=0;i<num;i++) {
				result[index++] = value;
			}
			System.out.println(Arrays.toString(result));
		}
	}
}
