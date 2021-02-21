package view;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 * Classe que vai tratar os eventos do botão
 * que a registrar. 
 * @author C. Tosin
 *
 */
// Questionamento: não seria melhor implementar ActionListener? 
public class SairAction extends AbstractAction { // Leia a documentação de AbstractAction. 

	@Override
	public void actionPerformed(ActionEvent e) { // Swing é quem faz a chamada a esse método.
		System.exit(0); // Essa chamada encerra o programa e faz com que a JVM termine.
				
	}

	

}
