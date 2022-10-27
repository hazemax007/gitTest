package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStock;
	private String libelleStock;
	private Integer qte;
	private Integer qteMin;
	@OneToMany(mappedBy = "stock")
	@JsonIgnore
	private Set<Produit> produits;
	public Stock(String libelleStock, Integer qte, Integer qteMin) {
		super();
		this.libelleStock = libelleStock;
		this.qte = qte;
		this.qteMin = qteMin;
	}
	
	public Stock(String libelleStock, Integer qte, Integer qteMin, Set<Produit> produits) {
		super();
		this.libelleStock = libelleStock;
		this.qte = qte;
		this.qteMin = qteMin;
		this.produits = produits;
	}
	
	public Stock(StockDTO sDTO) {
		this.libelleStock = sDTO.getLibelleStock();
		this.qte = sDTO.getQte();
		this.qteMin = sDTO.getQteMin();
	}
	
	public Stock(StockDTO1 sDTO1) {
		this.libelleStock = sDTO1.getLibelleStock();
		this.qte = sDTO1.getQte();
		this.qteMin = sDTO1.getQteMin();
		this.produits = sDTO1.getProduits();
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
