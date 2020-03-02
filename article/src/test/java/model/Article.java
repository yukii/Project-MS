package model;

public class Article {
	private int id;
	private String nom;
	
public Article() {
	
}

public Article(int id, String nom) {
	super();
	this.id = id;
	this.nom = nom;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

@Override
public String toString() {
	return "Article [id=" + id + ", nom=" + nom + "]";
}



}
