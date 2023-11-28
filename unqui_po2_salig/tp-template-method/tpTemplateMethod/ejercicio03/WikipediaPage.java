package tpTemplateMethod.ejercicio03;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface WikipediaPage
{
	
	String getTitle(); 
	/* Retorna el título de la página.*/
	
	List<PaginaWikipedia> getLinks(); 
	/* Retorna una Lista de las páginas de Wikipedia con las que se conecta.*/
	
	Map<String, PaginaWikipedia> getInfobox(); 
	/*Retorna un Map con un valor en texto y la pagina que describe ese valor que aparecen en los infobox de la página de Wikipedia.*/

}
