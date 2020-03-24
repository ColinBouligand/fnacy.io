package commerce.gestion;

import java.util.ArrayList;
import java.util.List;

import commerce.catalogue.domaine.modele.Livre;

public class Panier {
	private double total;
	private ArrayList<LignePanier> lignesPanier;

	public Panier() {
		this.total = 0;
		lignesPanier = new ArrayList<LignePanier>();
	}

	public void setTotal() {
		recalculer();
	}

	public double getTotal() {
		recalculer();
		return total;
	}

	public List<LignePanier> getLignesPanier() {
		return lignesPanier;
	}

	public void recalculer() {
		total = 0;
		for (LignePanier lp : lignesPanier) {
			total += lp.getPrixTotal();
		}
	}

	public void ajouterLigne(Livre inLivre) {
		boolean present = false;
		
		for(LignePanier lp : lignesPanier)
		{
			if(inLivre.equals(lp.getLivre()))
			{
				present=true;
				lp.setQuantite(lp.getQuantite()+1);
				recalculer();
				break;
			}
		}
		if(!present) {
		LignePanier lp = new LignePanier();
		lp.setLivre(inLivre);
		lp.setPrixUnitaire(inLivre.getPrix());
		lp.setQuantite(1);
		lignesPanier.add(lp);
		recalculer();
		}
	}

	public LignePanier chercherLignePanier(Livre inLivre) {
		for (LignePanier lp : lignesPanier) {
			if (lp.getLivre().equals(inLivre)) {
				return lp;
			}
		}
		return null;
	}

	public void supprimerLigne(String inRefLivre) {
		LignePanier lpSave=null;
		for (LignePanier lp : this.lignesPanier) {
			if (lp.getLivre().getRefLivre().equals(inRefLivre)) {
				total -= lp.getPrixTotal();
				lpSave=lp;
				
			}
		}if(lpSave!=null) {
		lignesPanier.remove(lpSave);
		}
	}

	public void viderPanier() {
		this.total = 0;
		lignesPanier.removeAll(getLignesPanier());
	}

	public boolean equals(Object o) {

		if (o instanceof Panier) {
			Panier p = (Panier) o;
			if (this.getLignesPanier().size() != p.getLignesPanier().size()) {
				return false;
			} else {
				int nbLignes = p.getLignesPanier().size();
				for (LignePanier lp1 : p.getLignesPanier()) {

					for (LignePanier lp : lignesPanier) {
						if (lp.equals(lp1)) {
							nbLignes--;
							break;
						}
					}
				}
				if(nbLignes==0)
				{
					return true;
				}
			}

		}
		return false;

	}
}
