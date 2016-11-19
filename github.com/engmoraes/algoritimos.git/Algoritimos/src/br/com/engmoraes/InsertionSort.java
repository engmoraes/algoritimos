package br.com.engmoraes;

import java.util.List;

public class InsertionSort {


	public List<Integer> insertion(List<Integer> values) {
		int vetor = values.size();
		int menor = 0;

		for (int i = 0; i < vetor; i++) {
			int valor = values.get(i);
			values.remove(i);
			for (int j = vetor-i; j < vetor-1; j++) {
				if (valor > values.get(j+1))  {
					values.add(valor);
				}
			}
		}
		return values;
	}

}
