package br.com.engmoraes;

import java.util.List;

public class SelectionSort {

	List<Integer> selection(List<Integer> values) {
		int vetor = values.size();
		int menor = 0;

		for (int i = 0; i < vetor; i++) {
			menor = i;
			for (int j = i; j < vetor; j++) {
				if (values.get(j) < values.get(menor)) {
					menor = j;
				}
			}
			int tmp = values.get(menor);
			values.remove(menor);
			values.add((i), tmp);
		}

		return values;
	}
}
