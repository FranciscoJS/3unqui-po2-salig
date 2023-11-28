package tpTemplateMethod.ejercicio03;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public interface SimilarPages 
{

	public List<PaginaWikipedia> getSimilarPages(PaginaWikipedia page, List<PaginaWikipedia> wikipedia);
	
}
