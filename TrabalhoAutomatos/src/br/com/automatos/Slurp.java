package br.com.automatos;

import java.util.regex.Pattern;

public class Slurp {

	public static void main(String[] args) {
		String slump = "DFDFDFDFG"; //DFG,EFG, DFFFFFG, DFDFDFDFG, DFEFFFFFG, EFFFFFFFEFG
		String nslump = "DEEEG,";//EFAHG, DEFG, DG, EFFFFDG, DEEEG
		String slimp = "ABAEFGCC";//, ABAHC, ABABAHCC, ADFGC, ADFFFGC, ABAEFGCC, ADFDFGC, ABABAEFGCCC"
		String nslimp ="";
		//String regex slump = "((DF|EF)(F*))*G{1}";
		
		String regex = "(AH)|[AB]+[H]C*|((AH)|(AB|A((DF|EF)(F*)*G{1})C*))";
		System.out.println(Pattern.matches(regex, slimp)); 

	}

}
