package bibliotecaabc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bibliotecaabc.entity.Editora;

@Service
public class EditoraService {
	List<Editora> lista = new ArrayList<>();
	
	public String save(Editora editora) {
		lista.add(editora);
		return editora.getNomeEditora()+" salvo com sucesso";
	}
	
	public String update(long id, Editora editora) {

		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdEditora() == id) {
					lista.set(i, editora);
					return editora.getNomeEditora()+ " alterado com sucesso";
				}
			}

		return "carro não encontrado para alterar";
	}

	
	
	public List<Editora> listAll(){
		
		Editora editora = new Editora(1, "lux", "Rua almirante barroso, 1010", "45)3500-0000");
		Editora editora2 = new Editora(2, "Epigrafe", "Rua almirante barroso, 1020", "45)3500-0000");
		Editora editora3 = new Editora(3, "Saraiva", "Rua almirante barroso, 1030", "(45)3500-0000");
		
		lista.add(editora);
		lista.add(editora2);
		lista.add(editora3);
		
		return lista;
	}
	
	
	public Editora findById(long idEditora) {
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdEditora() == idEditora) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idEditora) {
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getIdEditora() == idEditora) {
					lista.remove(lista.get(i));
					return "Deletado com sucesso";
				}
			}

		return "Não encontrado para deletar";

	}
	
}
