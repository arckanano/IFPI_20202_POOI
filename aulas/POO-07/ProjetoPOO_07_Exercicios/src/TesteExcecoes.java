import java.util.Scanner;

public class TesteExcecoes {

	public static void main(String[] args) {
		String op = "";
		do {
			try {
				System.out.println("1) Exce��o de numero inv�lido 2) Exce��o de �ndice inv�lido 3) sair ");
				Scanner sc = new Scanner(System.in);
				op =  sc.next();
				
				if (op.equals("1")) {
					Integer.parseInt("abc");
				} else if (op.equals("2")) {
					int[] i = new int[1];
					i[2] = 1;
				}
			} catch (NumberFormatException e) {
				System.out.println("N�mero inv�lido");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ndice de array inv�lido");
			} finally {
				System.out.println("________");
			}
		} while (!op.equals("3"));
		System.out.println("Aplicacao encerrada.");
		
	}

}
