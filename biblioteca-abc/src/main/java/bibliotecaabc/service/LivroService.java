package bibliotecaabc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bibliotecaabc.entity.Livro;

@Service
public class LivroService {
	List<Livro> lista = new ArrayList<>();
	
	public String save(Livro livro) {
		lista.add(livro);
		return livro.getTituloLivro()+" salvo com sucesso";
	}
	
	public String update(long id, Livro livro) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdLivro() == id) {
					lista.set(i, livro);
					return livro.getTituloLivro()+ " alterado com sucesso";
				}
			}

		return "carro não encontrado para alterar";
	}
	
	public List<Livro> listAll(){
		
		
		Livro livro = new Livro(1, "6543-9786", "A menina que roubava livros", "Uma menina roubava livros", 2015, 105);
		Livro livro2 = new Livro(2, "0743-5791", "O Atirador", "Conta a história de um atirador de elite dos EUA", 2019, 162);
		Livro livro3 = new Livro(3, "7545-0984", "Neymar", "Esse livro é a biografia de um dos jogadores que saiu do nada no Brasil", 2023, 198);
		
		lista.add(livro);
		lista.add(livro2);
		lista.add(livro3);
		
		return lista;
	}
	
	public Livro findById(long idLivro) {
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdLivro() == idLivro) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idLivro) {
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdLivro() == idLivro) {
					lista.remove(lista.get(i));
					return "Deletado com sucesso";
				}
			}

		return "Não encontrado para deletar";

	}
}
