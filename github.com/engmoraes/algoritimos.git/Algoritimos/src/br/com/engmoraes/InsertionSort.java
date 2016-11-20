package br.com.engmoraes;

import java.util.List;

public class InsertionSort {

	//revisar fluxo
	
	public List<Integer> insertion(List<Integer> values) {
		int vetor = values.size();
		int menor = 0;

		for (int i = 0; i < vetor; i++) {
			for (int j = vetor-i; j < vetor ; j++) {
				if (j != 0 && values.get(j) < values.get(j - 1)) {
					menor = values.get(j);
					values.set(j, values.get(j - 1));
					values.set(j - 1, menor);
				}
			}
		}
		return values;
	}

}
