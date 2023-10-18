package cliente;
import java.util.ArrayList;
import java.util.Collection;

import propiedad.Propiedad;

public class Cliente implements GestorCreditos
{
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private float sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, float sueldoNetoMensual)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public float getSueldoNetoMensual()
	{
		return this.sueldoNetoMensual;
	}
	
	public float getSueldoNetoAnual()
	{
		return this.sueldoNetoMensual * 12;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public String getApellido()
	{
		return this.apellido;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public CreditoPersonal solicitarCreditoPersonal(float monto, int plazo)
	{
		return new CreditoPersonal( this, monto, plazo );
	}
	
	public CreditoHipotecario solicitarCreditoHipotecario(float monto, int plazo, Propiedad propiedad)
	{
		return new CreditoHipotecario( this, monto, plazo, propiedad );
	}
}
