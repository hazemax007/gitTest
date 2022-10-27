package tn.esprit.rh.achat.entities;

import java.util.Date;
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
public class FactureDTO {
	private Long idFacture;
	private float montantRemise;
	private float montantFacture;
	private Date dateCreationFacture;
	private Date dateDerniereModificationFacture;
	private Boolean archivee;
	private Set<DetailFacture> detailsFacture;
	private Fournisseur fournisseur;
	private Set<Reglement> reglements;
	public FactureDTO(float montantRemise, float montantFacture, Date dateCreationFacture,
			Date dateDerniereModificationFacture, Boolean archivee, Set<DetailFacture> detailsFacture,
			Fournisseur fournisseur, Set<Reglement> reglements) {
		super();
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateCreationFacture = dateCreationFacture;
		this.dateDerniereModificationFacture = dateDerniereModificationFacture;
		this.archivee = archivee;
		this.detailsFacture = detailsFacture;
		this.fournisseur = fournisseur;
		this.reglements = reglements;
	}
	
}
