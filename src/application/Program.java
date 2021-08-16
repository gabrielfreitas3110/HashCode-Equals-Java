package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Maria","maria@gmail.com");
		Client c2 = new Client("Gabriel","gabriel@gmail.com");
		Client c3 = new Client("Maria","maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";

		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c3));//Conteudo dos objetos
		System.out.println(c1 == c3); //referencia de memoria heap
		System.out.println(s1 == s2	);
		
	}

}
