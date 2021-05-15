package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
	private Long id;
	private String nom;
	private List<Adresse> adresses = new ArrayList<Adresse>();
	private List<Reservation> reservations = new ArrayList<Reservation>();

	public Client() {
		super();
	}

	public Client(String nom) {
		super();
		this.nom = nom;
	}
	
	public Client(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
