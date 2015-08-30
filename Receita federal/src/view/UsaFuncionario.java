/**
 * 
 */
package view;

import javax.swing.JOptionPane;

import model.Funcionario;

/**
 * @author Walter
 *
 */
public class UsaFuncionario {

	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
//		PessoaJuridica func = new PessoaJuridica();
		
		String u,v,t,z;
		int x;
		z = JOptionPane.showInputDialog("Digite 1 se o contribuinte for uma pessoa física \n Digite 2 se for pessoa jjurídica");
		x = Integer.parseInt(z);
		if(z.length()==1){
			switch (x) {
			case 1:
				u = JOptionPane.showInputDialog("Informe o nome do contribuinte");
				v = JOptionPane.showInputDialog("Informe o rg do contribuinte");
				t = JOptionPane.showInputDialog("Digite o número de identificação do cartão do contribuinte");
				funcionario.setNome(u);
				funcionario.setRg(v);
				funcionario.setCartao(t);
				
				System.out.println("Nome :" + funcionario.getNome());
				System.out.println("Rg :" + funcionario.getRg());
				System.out.println("Cartão :" + funcionario.getCartao());
				
				break;

			default:
				break;
			}
		}
	}

}
