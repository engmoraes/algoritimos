package br.com.engmoraes.ordenacao;

import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	Util util = new Util();

	public void init() {


		// 1 BubbleSort
		// 2 SelectionSort
		// 3 InsertionSort
		
		String order = "";
		while (order != null) {
			
			List<Integer> values = util.createValues(10);

			// List values
			util.print(values);
			
			order = JOptionPane.showInputDialog("Qual tipo de ordenacao ?");

			if (order == null || !order.chars().allMatch(Character::isDigit)) {
				break;
			}	

			int o = Integer.parseInt(order);

			switch (o) {
			case 1:
				BubbleSort bubbleSort = new BubbleSort();
				values = bubbleSort.bubble(values);
				util.print(values);
				break;

			case 2:
				SelectionSort selectionSort = new SelectionSort();
				values = selectionSort.selection(values);
				util.print(values);
				break;
				
			case 3:
				InsertionSort insertionSort = new InsertionSort();
				values = insertionSort.insertion(values);
				util.print(values);
				break;
			}
		}

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.init();

	}

}
