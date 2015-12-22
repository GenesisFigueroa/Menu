package Demo.entidades;

import java.util.Iterator;

public class Cliente {
private String identificacion;
private String nombres;
private String apellido;
private int edad;

public Cliente(){
	
}
public Cliente(String identificacion, String nombres, String apellido, int edad) {
	super();
	this.identificacion = identificacion;
	this.nombres = nombres;
	this.apellido = apellido;
	this.edad = edad;
}
public String getIdentificacion() {
	return identificacion;
}
public void setIdentificacion(String identificacion) {
	this.identificacion = identificacion;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	return "Cliente [identificacion=" + identificacion + ", nombres=" + nombres
			+ ", apellido=" + apellido + ", edad=" + edad + "]";
}
public static Iterator<String> iterator() {
	// TODO Auto-generated method stub
	return null;
}

}
