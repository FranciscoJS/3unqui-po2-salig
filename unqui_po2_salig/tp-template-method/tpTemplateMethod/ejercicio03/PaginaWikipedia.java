package tpTemplateMethod.ejercicio03;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PaginaWikipedia implements WikipediaPage
{
	private String titulo;
	private List<PaginaWikipedia> paginasConexas = new ArrayList<PaginaWikipedia>();
	private Map <String, PaginaWikipedia> infoBox = new HashMap<String, PaginaWikipedia>();
	
	
	
	
	
	public String getTitle()
	{
		return this.titulo;
	}


	public List<PaginaWikipedia> getLinks()
	{
		return this.paginasConexas;
	}
	
	public Map<String, PaginaWikipedia> getInfobox()
	{
		return this.infoBox;
	}
}
