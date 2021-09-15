package git_tuto;

import git_tuto.Vue;
import java.awt.Frame;

public class Application extends Frame {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
                String name="Olivier";
		Modèle modl = new Modèle();
		Contrôleur ctrl = new Contrôleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		this.setTitle("tutoriel git");
		this.add(vue);
		this.pack();
		this.setVisible(true);
	}

}
