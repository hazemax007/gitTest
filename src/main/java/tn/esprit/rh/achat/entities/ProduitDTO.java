package tn.esprit.rh.achat.entities;

import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProduitDTO {
	private Long idProduit;
	private String codeProduit;
	private String libelleProduit;
	private float prix;
	private Date dateCreation;
	private Date dateDerniereModification;
	private Stock stock;
	private Set<DetailFacture> detailFacture;
	private CategorieProduit categorieProduit;
}
