package com.br.GF;

import java.util.Scanner;

public class Tabuada1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in);
		System.out.println(" Digite um valor");	
		int	valor; 
		valor = scan.nextInt();
		;
		for ( int i = 1  ; i <= 10; i++) {

			System.out.println(valor + "*" + i + "=" + (valor * i) );



		}
		scan.close();
	}
}