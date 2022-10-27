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
public class OperateurDTO {
	private Long idOperateur;
	private String nom;
	private String prenom;
	private String password;
	private Set<Facture> factures;
}
