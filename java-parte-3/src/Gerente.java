
public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica( int senha ) {
		if ( this.senha == senha ) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		return getSalario();
	}

	public void setSenha( int senha ) {
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}
}
