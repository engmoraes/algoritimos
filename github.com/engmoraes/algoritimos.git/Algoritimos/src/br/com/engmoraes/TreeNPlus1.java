package br.com.engmoraes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TreeNPlus1 {

	public void inicio(){
		Integer ini = 0;
		Integer fim = 22;

		List<Integer> n = new ArrayList<Integer>();
		
		int i =0;
		int calc = 0;
		while(fim != calc){

			calc = calc(i);
			n.add(calc);			
			i++;
		}
		
		n= sortClean(n);
		
		System.out.println(ini + " " + fim + " " + n.size() + "\n\n");

		for (Iterator iterator = n.iterator(); iterator.hasNext();) {
			System.out.println((Integer) iterator.next());
		}
	}
	
	
	// Regra
	public Integer calc(Integer valor){
		if(valor%2==0){
			return valor / 2;
		}else{
			return (valor * 3) +1;
		}
	}
	
	public static List<Integer> sortClean(List<Integer> toOrder){
		toOrder = new ArrayList<Integer>(new HashSet<Integer>(toOrder));
		//Collections.sort(toOrder);
		
		return toOrder;
	}

	
	
	public static void main(String[] args) {
		TreeNPlus1 treeNPlus1 = new TreeNPlus1();
		treeNPlus1.inicio();

 	}
}
