package br.com.estudo.jsf.bean.estudante;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.jboss.security.acl.EntitlementEntry;

import br.com.estudo.jsf.model.Estudante;

@Named
@RequestScoped
public class EstudanteRegistrarBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Estudante estudante = new Estudante();
	private String[] nomeArray = { "Cristian", "Ribeio", "Mietlicki" };

	private List<String> nomeArray2 = Arrays.asList("Cristian\", \"Ribeio\", \"Mietlicki");
	private Set<String> nomeSet =  new HashSet<>(Arrays.asList("Cristian2\", \"Ribeio2\", \"Mietlicki2"));
	private Map<String,String> nomeMap = new HashMap<>();
	
	public Map<String, String> getNomeMap() {
		return nomeMap;
	}

	public void setNomeMap(Map<String, String> nomeMap) {
		this.nomeMap = nomeMap;
	}

	{
		nomeMap.put("Cristian", "nome1");
		nomeMap.put("Ribeiro", "SobreNome");
		nomeMap.put("Mietlicki", "UltimoNome" );
//		
//		for(Entry<String, String> EntitlementEntry : nomeMap.entrySet()) {
//			
//			System.out.println(EntitlementEntry.getKey());
//			System.out.println(EntitlementEntry.getValue());
//			
//		}
	}
	
	public void executar(String param) {
		System.out.println("Fazendo busca no banco de Dados: "+param);
		System.out.println("Processando os Dados");
		System.out.println("Exibir os Dados");
	}
	
	public String irParaIndex() {
		//dessa forma haverá redirect;
	 return "index2?faces-redirect=true";
	 //return "index2;
		
	}
	
	
	public Set<String> getNomeSet() {
		return nomeSet;
	}

	public void setNomeSet(Set<String> nomeSet) {
		this.nomeSet = nomeSet;
	}

	public List<String> getNomeArray2() {
		return nomeArray2;
	}

	public void setNomeArray2(List<String> nomeArray2) {
		this.nomeArray2 = nomeArray2;
	}

	public String[] getNomeArray() {
		return nomeArray;
	}

	public void setNomeArray(String[] nomeArray) {
		this.nomeArray = nomeArray;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

}
