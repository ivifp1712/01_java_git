package com.ejemplo.teoria;

public class Cliente {
	String nombre;
	String ciudad;
	int factura;
	
	public Cliente(String nombre, String ciudad, int factura) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.factura = factura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getFactura() {
		return factura;
	}

	public void setFactura(int factura) {
		this.factura = factura;
	}
	
	
	
	
}
