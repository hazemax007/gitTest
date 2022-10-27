package tn.esprit.rh.achat.entities;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FournisseurDTO {
	private Long idFournisseur;
	private String code;
	private String libelle;
	private CategorieFournisseur  categorieFournisseur;
	private Set<Facture> factures;
    private Set<SecteurActivite> secteurActivites;
    private DetailFournisseur detailFournisseur;
    
	public FournisseurDTO(String code, String libelle, CategorieFournisseur categorieFournisseur, Set<Facture> factures,
			Set<SecteurActivite> secteurActivites, DetailFournisseur detailFournisseur) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.categorieFournisseur = categorieFournisseur;
		this.factures = factures;
		this.secteurActivites = secteurActivites;
		this.detailFournisseur = detailFournisseur;
	}
    
}
