package Collections;

import java.util.*;
//*importa tudo 

public class exemplo1 {
 public static void main(String[] args)
 {
	 String a1 = "BLOCO I";
	 String a2 = "BLOCO II";
	 String a3 = "BLOCO III";
	
	//tipo determinado da arraylist que só aceita string
	 //objeto = aula
	 ArrayList<String> aula = new ArrayList<>();
	 
	System.out.println(aula);
	
	aula.add(a1);
	aula.add(a2);
	aula.add(a3);
	aula.add("Feira de empregabilidade");
	
	System.out.println(aula);
	// 2 de segunda posição
	aula.remove(2);
	
	System.out.println(aula);
	
 }
 
}
