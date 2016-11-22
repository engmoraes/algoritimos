package br.com.engmoraes.patterns.interfaces.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		RestUtil restUtil = new RestUtil();

		AdapterXmlRest obtemCpf = new AdapterXmlRest(restUtil);

		System.out.println("CPF -> " + obtemCpf.retornaCpf());

	}

}
