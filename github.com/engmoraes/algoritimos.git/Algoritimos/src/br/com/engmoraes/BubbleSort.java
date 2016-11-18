package br.com.engmoraes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class BubbleSort {

	public void init(){
		List<Integer> values = new ArrayList<Integer>(); 
		
		Random value = new Random();
		
		int tam = 50;
		
		//Insert values
		for (int i = 0; i < tam; i++) {
			values.add(value.nextInt(tam+10));
		}

		//List values 
		print(values);
		
		Long time_start = System.currentTimeMillis();
		values = orderMyCode(values);
		Long time_finish = System.currentTimeMillis();
		
		System.out.println("tempo " + (time_finish-time_start));

		print(values);
		print(remDuplicate(values));
	}
	
	private List<Integer> remDuplicate(List<Integer> values){
		return new ArrayList<Integer>(new HashSet(values));
	}
	
	 
	private void print(List<Integer> values){
		
		String txt = "";
		
		for (int p = 0; p < values.size(); p++) {
			txt += values.get(p) +", ";
		}
		System.out.println(txt);
		
	}

	private List<Integer> orderMyCode(List<Integer> values) {
		//v1 -
		
		int size, conta = values.size();
		int tam = 0;
		while(tam!=conta){
			size = conta;
			while(size != 1){
				size--;
				if(values.get(size-1)<values.get(size)){
					int temp = values.get(size);
					values.remove(size);
					values.add(size-1, temp);		
				}
			}
			tam++;
		}
		
		return values;
	}



	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.init();
	}

}
