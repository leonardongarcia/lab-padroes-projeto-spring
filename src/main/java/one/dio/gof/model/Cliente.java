package one.dio.gof.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;
}
