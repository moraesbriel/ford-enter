package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		String curso1 = "Logica", curso2 = "POO", curso3 = "BackEnd";
		
		ArrayList<String>FordEnter = new ArrayList<String>(); //importando o ArrayList
		
		System.out.println(FordEnter);
		
		FordEnter.add(curso1); // adicionando uma variável dentro do ArrayList
		System.out.println(FordEnter);
		
		FordEnter.add(curso2);
		FordEnter.add(curso3);
		System.out.println(FordEnter);
		
		FordEnter.add("HTML"); // adicionando um valor que não foi atribuído a nenhuma variável
		System.out.println(FordEnter);
		
		FordEnter.add(3, "CSS"); // adicionando um valor em uma determinada posição
		System.out.println(FordEnter);
		
		FordEnter.remove(4); // removando um valor de uma determinada posição
		System.out.println(FordEnter);
		
		String var = FordEnter.get(0); // copiando um valor do ArrayList e atribuindo a uma variável
		System.out.println(var);
		
		System.out.println(FordEnter.size()); // para saber o tamanho da ArrayList
		
		System.out.println(FordEnter.contains("Angular")); // para saber se há um determinado valor dentro do ArrayList
		
		Collections.sort(FordEnter); // para colocar o ArrayList em ordem crescente
		System.out.println(FordEnter);
		
		FordEnter.clear(); // para apagar tudo que tem na ArrayList
		System.out.println(FordEnter); 
	}
}