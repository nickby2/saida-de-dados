package application;

public class Program {

	public static void main(String[] args) {

		System.out.println("Ola Mundo");
		System.out.println("Bom dia!");
		
		System.out.println("---------------------------------------------");
		
		int y = 32;
		double x = 10.4535337839;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); 
		
		System.out.printf("Resultado: %.2f metros %n", x );
		
		System.out.println("---------------------------------------------");
		String nome = "Lucas Rodrigues";
		int idade = 26;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);
		
	}

}
