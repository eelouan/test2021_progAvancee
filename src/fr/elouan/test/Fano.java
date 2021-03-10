package fr.elouan.test;

public class Fano {

	int id;
	double duree;
	
	public Fano(int _id, double _duree) {
		if(_id < 1 || _id > 100) {
			System.out.println("erreur lors de la création de l'id" + _id);
			return;
		}
		id = _id;
		duree = _duree;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void isOver() {

	}
}
