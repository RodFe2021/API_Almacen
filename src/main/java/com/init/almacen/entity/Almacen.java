package com.init.almacen.entity;


public class Almacen {
	
	private int id;
	private String nombre;
	private String fecha;
	private int capacidad;
	
	
	
	public Almacen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Almacen(int id, String nombre, String fecha, int capacidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.capacidad = capacidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	

}
