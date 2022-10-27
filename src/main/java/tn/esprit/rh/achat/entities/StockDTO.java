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
public class StockDTO {
	private Long idStock;
	private String libelleStock;
	private Integer qte;
	private Integer qteMin;
	private Set<Produit> produits;
}
