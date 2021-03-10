package fr.elouan.test;

import java.util.ArrayList;

/*
	Le serveur doit etre unique -> utilisation du design pattern "Singleton"
	Il permet de
	    - ajouter un musicien
	    - enlever un musicien
	    - ajouter une partition
	    - enlever une partition
	Il enregistre la liste de musiciens et de partitions
 */

public class Server {

	ArrayList<Fano> listFano;
	ArrayList<User> listUser;
	

    //Declaration de l'instance du singleton
    private static Server m_instance = null;

    //Constructeur privé
    private Server () {
        listUser = new ArrayList<>();
        listFano = new ArrayList<>();
    }

    //Methode statique d'acces au serveur unique
    public static Server getInstance() {
        if (m_instance == null) {
            m_instance = new Server();
        }
        return m_instance;
    }

    //Remise a zero des listes
    public void clean() {
        listUser.clear();
        listFano.clear();
    }
}
