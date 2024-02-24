package bibliotecaabc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bibliotecaabc.entity.Autor;

@Service
public class AutorService {
	List<Autor> lista = new ArrayList<>();

	public String save(Autor autor) {
		lista.add(autor);
		return autor.getNomeAutor()+ " salvo com sucesso";
	}


	public String update(long id, Autor autor) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdAutor() == id) {
					lista.set(i, autor);
					return autor.getNomeAutor()+ " alterado com sucesso";
				}
			}

		return "carro não encontrado para alterar";
	}


	public List<Autor> listAll(){

		Autor autor = new Autor(1, "Francisco Lima", "9899898999", 43);
		Autor autor2 = new Autor(2, "Vinicius Alberto", "12112112112", 56);
		Autor autor3 = new Autor(3, "Carlos Nobrega", "00000000000", 34);

		lista.add(autor);
		lista.add(autor2);
		lista.add(autor3);

		return lista;
	}

	public Autor findById(long idAutor) {
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdAutor() == idAutor) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idAutor) {
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdAutor() == idAutor) {
					lista.remove(lista.get(i));
					return "Deletado com sucesso";
				}
			}

		return "Não encontrado para deletar";

	}



}
