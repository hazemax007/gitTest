package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	private String code;
	private String libelle;
	@Enumerated(EnumType.STRING)
	private CategorieFournisseur  categorieFournisseur;
	@OneToMany(mappedBy="fournisseur")
	@JsonIgnore
	private Set<Facture> factures;
    @ManyToMany
    @JsonIgnore
    private Set<SecteurActivite> secteurActivites;
    @OneToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
    private DetailFournisseur detailFournisseur;
	
	public Fournisseur(String code, String libelle, CategorieFournisseur categorieFournisseur, Set<Facture> factures,
			Set<SecteurActivite> secteurActivites, DetailFournisseur detailFournisseur) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.categorieFournisseur = categorieFournisseur;
		this.factures = factures;
		this.secteurActivites = secteurActivites;
		this.detailFournisseur = detailFournisseur;
	}
	
	
	public Fournisseur(FournisseurDTO fDTO) {
		this.code = fDTO.getCode();
		this.libelle = fDTO.getLibelle();
		this.categorieFournisseur = fDTO.getCategorieFournisseur();
		this.factures = fDTO.getFactures();
		this.secteurActivites = fDTO.getSecteurActivites();
		this.detailFournisseur = fDTO.getDetailFournisseur();
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
	
}
