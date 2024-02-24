package bibliotecaabc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Livro {
	
	private Integer idLivro;
	private String issnLivro;
	private String tituloLivro;
	private String sinopeLivro;
	private Integer anoLivro;
	private Integer numeroPaginaLivro;
}
