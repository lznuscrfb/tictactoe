package tests;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * La classe Tests permet d'afficher l
 * @author Noé
 * @version 0.1
 */
public class Joueur {
	/**
	 * Le niveau du joueur
	 * @see int
	 */
	private int _level;
	
	/**
	 * Le surnom du joueur.
	 * @see String
	 */
	private String _nickname;
	
	/**
	 * L'ID du joueur.
	 * @see String
	 */
	private String _id;
	
	/**
	 * Adresse du profil du joueur. Cette adresse n'est pas modifiable.
	 * @see URL
	 */
	private URL _url;
	
	/**
	 * Constructeur de la classe Tests.
	 * @param level Définition du niveau du joueur.
	 * @param nickname Définition du surnom du joueur.
	 * @param id Définition de l'ID du joueur.
	 */
	public Joueur(String nickname, String id, int level) {
		_nickname = nickname;
		_id = id;
		_level = level;
		_url = null;
	}
	
	/**
	 * Met à jour le niveau du joueur.
	 * @param level Le nouveau level du joueur.
	 */
	public void setLevel(int level) {
	    _level = level;
	}

	/**
     * Retourne le level du joueur.
     * @return level Le niveau du joueur
     */
    public int getLevel() {
    	return _level;
    }
    
    /**
	 * Met à jour le surnom du joueur.
	 * @param level Le nouveau surnom du joueur.
	 */
	public void setNickname(String nickname) {
	    _nickname = nickname;
	}

	/**
     * Retourne le surnom du joueur.
     * @return _nickname Le surnom du joueur
     */
    public String getNickName() {
    	return _nickname;
    }
    
    /**
	 * Met à jour l'ID du joueur.
	 * @param level Le nouvel ID du joueur.
	 */
	public void setID(String id) {
	    _id = id;
	}

	/**
     * Retourne l'ID du joueur.
     * @return _id L'ID du joueur
     */
    public String getID() {
    	return _id;
    }
    
    /**
     * Retourne l'adresse du joueur
     * @return L'URL du profil du joueur, générée à partir de l'id du Zero.
     */
    public URL getURLProfil() {
    	return _url;
    }
    
    /**
     * Met à jour l'adresse de profil du joueur
     * @throws MalformedURLException Si jamais l'url est mal formée. 
     */
    public void setURLProfil() throws MalformedURLException {
    	_url = new URL("http://localhost/joueurs/profil_" + _id + ".html");
    }
    
    /**
     * Retourne les informations du joueur.
     * @return Le surnom, l'ID, le niveau, et le profil du joueur
     */
    public String toString() {
    	return "JOUEUR:\n"
    			+ "Surnom: " + _nickname + "\n"
    			+ "ID: " + _id + "\n"
    			+ "Niveau: " + _level + "\n"
    			+ "Profil (lien): " + _url + "\n";
    }

}
