package br.com.engmoraes;

import java.util.List;

public class Main {
	
	Util util = new Util();

	public void init(){
		
		List<Integer> values = util.createValues(50);

		//List values 
		util.print(values);
		BubbleSort bubbleSort = new BubbleSort();
		
		values = bubbleSort.bubble(values);

		
		util.print(values);
		util.print(util.remDuplicate(values));
	}


	public static void main(String[] args) {
		Main main = new Main();
		main.init();

	}

}
