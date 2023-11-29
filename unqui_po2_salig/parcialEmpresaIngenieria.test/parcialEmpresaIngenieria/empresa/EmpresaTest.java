package parcialEmpresaIngenieria.empresa;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parcialEmpresaIngenieria.medioDePago.*;
import parcialEmpresaIngenieria.actividad.*;


class EmpresaTest 
{

    public static void main(String[] args) 
    {
        // Operarios y materiales para Obra I
        Operario camaño = new Operario(60, 100, 10);
        Operario ramon = new Operario(60, 100, 4);
        Operario cecilio = new Operario(60, 100, 6);
        Material ladrillos = new Material(100, 1000);

        // Crear Obra I
        List<Operario> albañiles = Arrays.asList(camaño, ramon, cecilio);
        List<Material> materiales = Arrays.asList(ladrillos);
        Obra construccion = new Obra(albañiles, materiales);

        // Operarios y materiales para Obra II
        Operario jose = new Operario(60, 100, 8);
        Operario fran = new Operario(60, 100, 5);

        // Crear Obra II
        List<Operario> albañilesII = Arrays.asList(jose, fran);
        List<Material> materialesII = new ArrayList<>(); // Lista vacía de materiales
        Obra gasoducto = new Obra(albañilesII, materialesII);
        
        // Crear Transporte
        Transporte camion = new Transporte(500, 100, 5);

        // Medios de pago
        Efectivo efectivo = new Efectivo();
        MercadoPago mercadoPago = new MercadoPago();
        Credito credito = new Credito(3);

//        // Lista de actividades para Proyecto I
//        List<Actividad> listaActividadesI = Arrays.asList(construccion);
//
//        // Lista de actividades para Proyecto II
//        List<Actividad> listaActividadesII = Arrays.asList(gasoducto, camion);

        // Crear Proyectos
        Proyecto proyectoSecundario = new Proyecto();
        Proyecto proyectoPrincipal = new Proyecto();
  
        proyectoSecundario.add(camion);
        proyectoSecundario.add(gasoducto);
        proyectoPrincipal.add(construccion);
        proyectoPrincipal.add(proyectoSecundario);


        // Crear Empresa
        Empresa asmesa = new Empresa("ASMESA & Co", "24-39672683-8", efectivo, proyectoPrincipal);

        // Calcular costos totales
        double costoTotalProyectoPrincipal = proyectoPrincipal.costoTotal(asmesa);
        double costoTotalProyectoSecundario = proyectoSecundario.costoTotal(asmesa);

        // Imprimir resultados
        System.out.println("Costo total de camaño: " + camaño.costoTotal() );
        System.out.println("Costo total de cecilio: " + cecilio.costoTotal());
        System.out.println("Costo total de ramon: " + ramon.costoTotal());
        System.out.println("Costo total de ladrillos: " + ladrillos.costoTotal(asmesa));
        System.out.println("Costo total de obra I: " + construccion.costoTotal(asmesa));
        System.out.println("_______________");
        
        
        System.out.println("Costo total de jose: " + jose.costoTotal());
        System.out.println("Costo total de fran: " + fran.costoTotal());
        System.out.println("Costo total de camion: " + camion.costoTotal(asmesa));
        System.out.println("Costo total de obra II: " + proyectoSecundario.costoTotal(asmesa));
        System.out.println("_______________");
        
        System.out.println("Costo total del Proyecto Secundario: " + costoTotalProyectoSecundario);
        System.out.println("Costo total del Proyecto Principal: " + costoTotalProyectoPrincipal);
        
        System.out.println("_______________");
        System.out.println("Costo total de actividad princopa ASMESA & Co en efectivo: " + asmesa.costoActividadActual());

    }
    
}

//{
//	
//
//	public static void main(String[] args)
//	{
//		
//		// Obra I
//		Operario camaño;
//		Operario ramon;
//		Operario cecilio;
//		Material ladrillos;
//		Obra construccion;
//		
//		// Obra II
//		Operario jose;
//		Operario fran;
//		Obra gasoducto;
//		Transporte camion;
//		
//		// Proyectos
//		Proyecto proyectoPrincipal;
//		Proyecto proyectoSecundario;
//		
//		// Medios de pago
//		MedioDePago efectivo;
//		MedioDePago mercadoPago;
//		MedioDePago credito;
//		
//		// Obra I
//		construccion = new Obra( albañiles, materiales );
//		ladrillos = new Material( 100, 1000 );
//		camaño = new Operario( 60, 100, 10 );
//		ramon = new Operario( 60, 100, 4 );
//		cecilio = new Operario( 60, 100, 6 );
//		
//
//		
//		// Medios de pago
//		credito = new Credito( 3 );
//		
//		
//		List<Operario> albañiles = new ArrayList<Operario>
//		(
//				Arrays.asList
//				(
//						camaño, ramon, cecilio
//				)
//		);
//		
//		List<Material> materiales = new ArrayList<Material>
//		(
//				Arrays.asList
//				(
//						ladrillos
//				)
//		);	
//		
//		List<Operario> albañilesII = new ArrayList<Operario>
//		(
//				Arrays.asList
//				(
//						jose, fran
//				)
//		);
//		
//		List<Material> materialesII = new ArrayList<Material>
//		(
//				Arrays.asList
//				(
//						// No hay plata
//				)
//		);
//
//		List<Actividad> listaActividadesI = new ArrayList<Actividad>
//		(
//				Arrays.asList
//				(
//						construccion
//				)
//		);
//		
//		List<Actividad> listaActividadesII = new ArrayList<Actividad>
//		(
//				Arrays.asList
//				(
//						gasoducto, camion
//				)
//		);
//		
//		
//		// Obra I
//		construccion = new Obra( albañiles, materiales );
//	
//		// Obra II
//		gasoducto = new Obra( albañilesII, materialesII );
//		camion = new Transporte( 500, 100, 5 );
//
//		
//		
//		Empresa asmesa("ASMESA & Co", "24-39672683-8",  efectivo, proyectoPrincipal);
//		MedioDePago efectivo = new Efectivo();
//		
//		// Proyectos
//		proyectoPrincipal = new Proyecto( listaActividadesI, proyectoSecundario );
//		proyectoSecundario = new Proyecto( listaActividadesII, camion );
//		
//	}
//	
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//
//}
	

