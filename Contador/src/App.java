import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		terminal.close();
		
		try {
			// Chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException erro) {
			// Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}

	// Classe de exceção deve ser aninhada ou separada
	static class ParametrosInvalidosException extends Exception {
		private static final long serialVersionUID = 1149241039409861914L;

		// Construtor padrão
		public ParametrosInvalidosException() {
			super();
		}

		// Construtor com mensagem
		public ParametrosInvalidosException(String msg){
			super(msg);
		}

		// Construtor com causa
		public ParametrosInvalidosException(Throwable t){
			super(t);
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// Validar se parametroUm é MENOR que parametroDois e lançar a exceção se não for
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println(i);
		}
	}
}
