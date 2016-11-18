package br.com.engmoraes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Util {


	void print(List<Integer> values) {

		String txt = "";

		for (int p = 0; p < values.size(); p++) {
			txt += values.get(p) + ", ";
		}
		System.out.println(txt);
	}

	List<Integer> remDuplicate(List<Integer> values) {
		return new ArrayList<Integer>(new HashSet(values));
	}
	
	
	List<Integer> createValues(int tam){
		
		List<Integer> values = new ArrayList<Integer>(); 
		
		Random value = new Random();

		//Insert values
		for (int i = 0; i < tam; i++) {
			values.add(value.nextInt(tam+10));
		} 
		
		return values;
	}

}