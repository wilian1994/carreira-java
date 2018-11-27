
public class ControleBonificacao {

	private double soma;

	public double getSoma() {
		return soma;
	}

	public void registra( Funcionario funcionario ) {
		double boni = funcionario.getBonificacao();
		this.soma += boni;
	}

}
