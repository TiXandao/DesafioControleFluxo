//Arquivo: ParametrosInvalidosException.java


public class ParametrosInvalidosException extends Exception {
// Declarando ID para evitar o aviso
		private static final long serialVersionUID = 1L;

		public ParametrosInvalidosException(String mensagem) {
			super(mensagem);
	}
}
