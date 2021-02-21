package app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.BotaoAction;
import view.Janela;

public class App {

	public static void main(String[] args) {

		new Janela();
		


	}


	public void conteudoAula1() {
		// Lembrando de JFrame e suas propriedades básicas...
		JFrame f = new JFrame();
		f.setTitle("Janela");
		f.setSize(300, 200);
		f.setLocation(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Lembrando do JPanel e outros componentes...
		JPanel p = new JPanel(); // é um componente invisível que serve para add outros componentes

		JLabel l = new JLabel("Digite seu nome:");
		p.add(l);

		JTextField t = new JTextField(10);
		p.add(t);

		JButton b = new JButton("OK");
		BotaoAction action = new BotaoAction(t);
		b.addActionListener(action);
		p.add(b);


		f.add(p);
		f.setVisible(true);
	}

}
