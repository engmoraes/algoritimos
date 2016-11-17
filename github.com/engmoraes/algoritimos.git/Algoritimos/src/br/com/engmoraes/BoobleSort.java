package br.com.engmoraes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoobleSort {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>(); 
		
		Random value = new Random();
		
		int tam = 5;
		
		//Insert
		for (int i = 0; i < tam; i++) {
			values.add(value.nextInt(tam+10));
		}

		for (int i = 0; i < tam; i++) {
			System.out.println(values.get(i) + " ");
		}
		
		Integer temp = 0;
		
		for (int i = 0; i < tam-1; i++) {
				//order
			
		}
		
		System.out.println("\norder \n");
		
		for (int i = 0; i < tam; i++) {
			System.out.println(values.get(i) + " ");
		}
		
		
	}

}
