package edu.pitt.cs;

public class CatImpl implements Cat {

	int id;
	String name;
	boolean rented;
	// TODO: Fill in with member variables

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.rented = false;// TODO: Fill in
	}

	public void rentCat() {
		this.rented = true;// TODO: Fill in
	}

	public void returnCat() {
		this.rented = false;// TODO: Fill in
	}

	public void renameCat(String name) {
		this.name = name;// TODO: Fill in
	}

	public String getName() {
		// TODO: Fill in
		return this.name;
	}

	public int getId() {
		// TODO: Fill in
		return this.id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return this.rented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + this.id + ". " + this.name;
	}

}