package br.com.engmoraes;

import java.util.Collections;
import java.util.List;

public class Main {
	
	Util util = new Util();

	public void init(){
		
		List<Integer> values = util.createValues(10);

		//List values 
		util.print(values);
//		
//		JFrame frame = new JFrame("tipo ordena");
//		frame.setSize(300, 150);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		JPanel panel = new JPanel();
//		frame.add(panel);
//		panel.add(new JLabel("Digite cod. Ordenacao"));
//		panel.add(new JTextField(20));
//		JButton ordenaButton = new JButton("Ordena");
//		panel.add(ordenaButton);
//		frame.setVisible(true);
//	
		//1		BubbleSort
		//2		SelectionSort
		
		int o = 1;
		
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
			
		
		}
	}


	public static void main(String[] args) {
		Main main = new Main();
		main.init();

	}

}
