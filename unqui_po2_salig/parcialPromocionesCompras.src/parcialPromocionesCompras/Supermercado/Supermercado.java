package parcialPromocionesCompras.Supermercado;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import parcialPromocionesCompras.Cliente.*;

public class Supermercado 
{
	
	public Map<Cliente, List<Compra>> listaClientesYCompras = new HashMap<>();
	
	
	public void registrarCompra( Cliente cliente, Compra compra )
	{
		if ( listaClientesYCompras.containsKey(cliente) ) 
		{
			listaClientesYCompras.get(cliente).add(compra);
        } 
		else
        {
            List<Compra> compras = new ArrayList<>();
            compras.add(compra);
            listaClientesYCompras.put(cliente, compras); // Asocia cliente a la nueva lista.
        }
	}

    public List<Compra> obtenerCompras(Cliente cliente) 
    {
        return listaClientesYCompras.getOrDefault( cliente, new ArrayList<>() );
    }
    
    public double montoTotalCompras(Cliente cliente)
    {
    	return this.obtenerCompras(cliente).stream().mapToDouble(compra -> compra.getMontoFinal() ).sum();
    }
    
    public int cantidadTotalCompras(Cliente cliente)
    {
    	return this.obtenerCompras(cliente).size();
    }

    public LocalDate fechaUltimaCompra(Cliente cliente) throws Exception 
    {
 //       return this.listaClientesYCompras.get(cliente).stream()
    		return this.obtenerCompras(cliente).stream()
                .map(Compra::getFechaDeCompra)
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new Exception("No se encontró ninguna compra efectuada por este cliente"));
    }

}
