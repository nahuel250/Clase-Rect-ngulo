package Rectangulo;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int ancho;
	private int alto;
	private Punto centro;
	private int color;
	
	public Rectangulo() {
		this.ancho = 0;
		this.alto = 0;
		this.centro = new Punto();
		this.color = 0;
	}
	
	public Rectangulo(int ancho, int alto, Punto centro, int color){
		this.ancho = ancho;
		this.alto = alto;
	    this.centro = centro;
	    this.color = color;
	}
	
	
	public Rectangulo(Rectangulo rectangulo) {
        this.ancho = rectangulo.ancho;
        this.alto = rectangulo.alto;
        this.centro = new Punto(rectangulo.centro);
        this.color = rectangulo.color;
    }
	
	
	public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
        	this.ancho = ancho;
        } else {
        	Pantalla.escribirString("El ancho debe ser positivo");
        }
    }
 
    public int getAlto() {
        return alto;
    }
 
    public void setAlto(int alto) {
        if (alto > 0) {
        	this.alto = alto;
        } else {
        	Pantalla.escribirString("El alto debe ser positivo");
        }
    	
    }

    public Punto getCentro() {
        return centro;
    }
 
    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    

    public int getColor() {
        return color;
    }
 
    public void setColor(int color) {
        if (color > 0) {
        	this.color = color;
        } else {
        	Pantalla.escribirString("El color debe ser positivo");
        }
    	
    }
	
    public void mostrarDatos() {
        Pantalla.escribirString("Rectángulo:");
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Ancho: " + ancho);
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Alto: " + alto);
        Pantalla.escribirSaltoLinea();
        centro.mostrarDatos();
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Color: " + color);
    }
	
    public void cambiarDatos() {
        Pantalla.escribirString("Cambiar datos del rectángulo:");
	
        int nuevoAncho = Teclado.leerInt("Nuevo ancho (0 para no cambiar):");
        if (nuevoAncho > 0) {
            setAncho(nuevoAncho);
        }
        
        
        int nuevoAlto = Teclado.leerInt("Nuevo alto (0 para no cambiar):");
        if (nuevoAlto > 0) {
            setAlto(nuevoAlto);
        }
        
        
        Pantalla.escribirString("Cambiar coordenadas del centro:");
        centro.leerDatos();
        
        int nuevoColor = Teclado.leerInt("Nuevo color (0 para no cambiar):");
        if (nuevoColor > 0) {
            setColor(nuevoColor);
        }

        mostrarDatos();
    }
	
	
}


