package bibliotecaabc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bibliotecaabc.entity.Biblioteca;

@Service
public class BibliotecaService {
	List<Biblioteca> lista = new ArrayList<>();

	public String save(Biblioteca biblioteca) {
		lista.add(biblioteca);
		return biblioteca.getNomeBilbioteca()+" salvo com sucesso";
	}
	
	
	public String update(long id, Biblioteca biblioteca) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdBiblioteca() == id) {
					lista.set(i, biblioteca);
					return biblioteca.getNomeBilbioteca()+ " alterado com sucesso";
				}
			}

		return "carro não encontrado para alterar";
	}

	public List<Biblioteca> listAll(){

		Biblioteca biblioteca = new Biblioteca(1, "Oscar", "(45)3500-0000");
		Biblioteca biblioteca2 = new Biblioteca(2, "Paulo Freire", "(45)3500-0000");
		Biblioteca biblioteca3 = new Biblioteca(3, "Natalino", "(45)3500-0000");

		lista.add(biblioteca);
		lista.add(biblioteca2);
		lista.add(biblioteca3);

		return lista;
	}


	public Biblioteca findById(long idBiblioteca) {
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdBiblioteca() == idBiblioteca) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idBiblioteca) {
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdBiblioteca() == idBiblioteca) {
					lista.remove(lista.get(i));
					return "Deletado com sucesso";
				}
			}

		return "Não encontrado para deletar";

	}

}
