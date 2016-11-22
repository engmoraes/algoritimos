package br.com.engmoraes.ordenacao;

import java.util.List;

public class BubbleSort {
	

	
	List<Integer> bubble(List<Integer> values) {
		// v1 desc

		int size, conta = values.size();
		int tam = 0;
		while (tam != conta) {
			size = conta;
			while (size != 1) {
				size--;
				if (values.get(size - 1) < values.get(size)) {
					int temp = values.get(size);
					values.remove(size);
					values.add(size - 1, temp);
				}
			}
			tam++;
		}

		return values;
	}


}
