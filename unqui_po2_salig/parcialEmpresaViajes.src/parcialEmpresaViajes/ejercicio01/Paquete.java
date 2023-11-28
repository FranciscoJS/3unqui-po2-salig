package parcialEmpresaViajes.ejercicio01;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Paquete extends Producto
{
	private double costoFijoGestion;
	List<Producto> listaProductos = new ArrayList<Producto>();
	
	public Paquete( double costoFijoPorPersona, double costoFijoDeGestion, List<Producto> listaProductos )
	{
		this.listaProductos = listaProductos;
		this.costoFijoPorPersona = costoFijoPorPersona;
		this.costoFijoGestion = costoFijoDeGestion;
	}
	
	public Paquete(){};
	
	public void agregarProducto( Producto producto )
	{
		this.listaProductos.add(producto);
	}
	
	public void quitarProducto( Producto producto )
	{
		this.listaProductos.remove(producto);
	}

	
	public LocalDate getFechaInicio() 
	{
	    return this.listaProductos.stream()
	            .map(Producto::getFechaInicio)
	            // .filter(Objects::nonNull)  // Filtrar fechas nulas
	            .min(Comparator.naturalOrder())
	            .orElseThrow(() -> new NoSuchElementException("La lista de productos está vacía o contiene fechas nulas."));
	}
	
	

	
	public LocalDate getFechaFin()
	{
        return  this.listaProductos.stream()
                .map( Producto::getFechaFin )
                .max( Comparator.naturalOrder() )
                .orElseThrow( () -> new NoSuchElementException("La lista de productos está vacía.") );
	}
	

	
/*
Collections.sort(listaCasas,new Comparator<Casa>(){
                 public int compare(Casa c1,Casa c2){
                       return c1.getMetrosCuadrados().compareTo(c2.getMetrosCuadrados())
                 }});

// Para precio
Collections.sort(listaCasas,new Comparator<Casa>(){
                 public int compare(Casa c1,Casa c2){
                       return c1.getPrecio().compareTo(c2.getPrecio())
                 }});
 */
	
	@Override
	protected double getImpuestos() 
	{
		return this.costoFijoGestion;
	}
	
	@Override
	public double getCostoTotal() 
	{
		return this.listaProductos.stream().mapToDouble( p -> p.getCostoTotal() ).sum() + this.costoFijoPorPersona - this.costoFijoGestion;
	}
}
