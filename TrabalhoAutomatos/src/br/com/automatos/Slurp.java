package br.com.automatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Slurp {

	public static void main(String[] args) {
		String regex_slurp  = "((AH)|[AB]+[H]C*|((AH)|(AB|A((DF|EF)(F*)*G{1})C*)))+(((DF|EF)(F*))*G{1})";
		ArrayList<String> palavras = new ArrayList<>();
		int nrlinha;
		String arquivo = "C:\\Users\\dionatan.paris\\Desktop\\data.txt";	
		
		try {
			FileReader arq = new FileReader(arquivo);
			BufferedReader lerArq = new BufferedReader(arq);
			nrlinha =  Integer.parseInt( lerArq.readLine());
			
			for (int i = 1; i <= nrlinha ;i++ ) {
				palavras.add(lerArq.readLine());
			}
		arq.close();
		
		for (String palavra : palavras) {
			if (Pattern.matches(regex_slurp, palavra)){
				System.out.println("Sim");
			}else{
				System.out.println("Não");
			}
			
		}
		System.out.println("finalizado com sucesso!");
		System.exit(0);
		
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não Encontrado!\n"+ e);
		} catch (IOException e) {
			System.err.println("Problema ao abrir o arquivo!\n"+e);
		}
	}
}