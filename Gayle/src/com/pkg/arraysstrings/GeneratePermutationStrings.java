package com.pkg.arraysstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GeneratePermutationStrings {

	public List<String> permute(char[] values) {
		List<String> resultList = new ArrayList<>();
		Map<Character, Integer> countMap = new TreeMap<>();
		for (char ch : values) {
			countMap.compute(ch, (key, val) -> {
				if (val == null) {
					return 1;
				} else {
					return val + 1;
				}
			});

			char str[] = new char[countMap.size()];
			int count[] = new int[countMap.size()];
			int index = 0;

			for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
				str[index] = entry.getKey();
				count[index] = entry.getValue();
				index++;
			}

			char result[] = new char[values.length];
			permuteUtil(str, count, result, 0, resultList);

		}
		return resultList;
	}

	private void permuteUtil(char[] str, int[] count, char[] result, int i, List<String> resultList) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		GeneratePermutationStrings gp = new GeneratePermutationStrings();

	}
}
