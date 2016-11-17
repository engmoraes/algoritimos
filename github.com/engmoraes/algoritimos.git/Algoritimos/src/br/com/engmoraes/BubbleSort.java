package br.com.engmoraes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;

public class BubbleSort {

	public void init(){
		List<Integer> values = new ArrayList<Integer>(); 
		
		Random value = new Random();
		
		int tam = 500;
		
		//Insert values
		for (int i = 0; i < tam; i++) {
			values.add(value.nextInt(tam+10));
		}

		//List values 
		for (int i = 0; i < tam; i++) {
			System.out.println(values.get(i) + " ");
		}
		
		System.out.println("\norder \n");
		
		Long time_start = System.currentTimeMillis();
		values = orderMyCode(values);
		Long time_finish = System.currentTimeMillis();

		
		
		for (int p = 0; p < tam; p++) {
			System.out.println(values.get(p) + " ");
		}
		
		System.out.println("tempo " + (time_finish-time_start));
	}
	
	

	private List<Integer> orderMyCode(List<Integer> values) {
		//v1 - o que deu na cabeça
		
		int size, conta = values.size();
		int aa = 0;
		while(aa!=conta){
			size = conta;
			while(size != 1){
				size--;
				if(values.get(size-1)<values.get(size)){
					int temp = values.get(size);
					values.remove(size);
					values.add(size-1, temp);		
				}
			}
			aa++;
		}
		
		return values;
	}



	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.init();
	}

}
