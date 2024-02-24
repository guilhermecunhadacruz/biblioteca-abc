package bibliotecaabc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Autor{
	
	private Integer idAutor;
	private String nomeAutor;
	private String cpfAutor;
	private Integer idadeAutor;

}
