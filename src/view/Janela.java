package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Janela extends JFrame{
	
	public Janela() {
		// configurações básicas do JFrame
		setTitle("Minha aplicação"); // configura o título da janela
		setSize(600,300);// configura o tamanho em pixels da janela
		setLocation(400,400); // configura a localização da janela na tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // configura o comportamento padrão ao usar alt+F4 ou clicar no 'X' da janela.
		
		JMenuBar menu = new JMenuBar(); // Cria a barra de menu. Não é visível até inserirmos menus nela. 
		
		JMenu menuArquivo = new JMenu("Arquivo"); // Cria um menu a ser inserido num JMenuBar.
		menuArquivo.setMnemonic('A'); // Configura uma letra mnenomica do menu em que o método é invocado.
		JMenu menuEditar = new JMenu("Editar");
		menuEditar.setMnemonic('E');
		
		
		JMenuItem itemNovo = new JMenuItem("Novo"); // Cria um item de menu a ser inserido em um Menu.
		itemNovo.setMnemonic('N');
		
		JMenuItem itemSair = new JMenuItem(new SairAction()); // Insere o objeto SairAction que vai tratar o evento do clique.
		itemSair.setText("Sair"); // Configura o texto do menuItem.
		itemSair.setMnemonic('S');
		
		menuArquivo.add(itemNovo); // adiciona o objeto do argumento(tipo JMenuItem) num menu(JMenu)
		menuArquivo.add(itemSair);
		
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		itemCopiar.setMnemonic('C');
		menuEditar.add(itemCopiar);
		
		menu.add(menuArquivo); // adiciona o menu JMenu menuArquivo à barra de menu.
		menu.add(menuEditar);
		
		setJMenuBar(menu); // configura o objeto JMenuBar para este JFrame. Só é permitido 1 barra de menu por janela.
		setVisible(true); // torna a janela visível quando criada, neste caso, pois estamos no construtor.
	}
	
	

}
