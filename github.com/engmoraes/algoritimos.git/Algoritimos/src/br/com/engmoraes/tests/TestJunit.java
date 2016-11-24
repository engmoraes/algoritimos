package br.com.engmoraes.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.engmoraes.ordenacao.SelectionSort;

public class TestJunit {
	
   String message = "nok";	

   @Test
   public void testPrintMessage() {
      message = "ok";

   }
}