/**
 * 
 */
package view;

import javax.swing.JOptionPane;

import model.Funcionario;
import model.PessoaJuridica;

/**
 * @author Walter
 *
 */
public class UsaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		PessoaJuridica func = new PessoaJuridica();

		String u, v, t, z;
		int x;
		z = JOptionPane.showInputDialog(
				"Digite 1 se o contribuinte for uma pessoa f�sica \n Digite 2 se for pessoa jur�dica");
		x = Integer.parseInt(z);
		if (z.length() == 1) {
			switch (x) {
			case 1:
				u = JOptionPane.showInputDialog("Informe o nome do contribuinte");
				v = JOptionPane.showInputDialog("Informe o rg do contribuinte");
				t = JOptionPane.showInputDialog("Digite o n�mero cart�o de identifica��o do contribuinte");

				funcionario.setNome(u);
				funcionario.setRg(v);
				funcionario.setCartao(t);

				System.out.println("Nome :" + funcionario.getNome());
				System.out.println("Rg :" + funcionario.getRg());
				System.out.println("Cart�o :" + funcionario.getCartao());

				break;
			case 2:
				u = JOptionPane.showInputDialog("Informe o nome do contribuinte");
				v = JOptionPane.showInputDialog("Informe o cnpj do contribuinte");
				t = JOptionPane.showInputDialog("Digite o n�mero do cart�o de identifica��o do contribuinte");

				funcionario.setNome(u);
				func.setCnpj(v);
				funcionario.setCartao(t);

				System.out.println("Nome: " + funcionario.getNome());
				System.out.println("Cnpj: " + func.getCnpj());
				System.out.println("Cart�o identifica��o: " + funcionario.getCartao() );

			default:
				
				break;
			}
		}
	}

}
