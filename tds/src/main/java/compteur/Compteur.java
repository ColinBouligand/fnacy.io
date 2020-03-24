package compteur;

public class Compteur {
	private int compteur;
	
	public Compteur()
	{
		this.compteur =0;
	}
	
	public int getCompteur()
	{
		return this.compteur;
	}
	
	public void setCompteur(int compteur)
	{
		this.compteur = compteur;
	}
	
	public void resetCompteur()
	{
		this.compteur = 0;
	}
	
	public void augmenterCompteur(int compteur)
	{
		this.compteur += compteur;
	}
	
	public void diminuerCompteur(int compteur)
	{
		this.compteur -= compteur;
	}
	
	public void augmenterCompteur()
	{
		this.compteur ++;
	}
	
	public void diminuerCompteur()
	{
		this.compteur --;
	}
	
	
	
}
