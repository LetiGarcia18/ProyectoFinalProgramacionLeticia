package clases;

public class Personaje extends Carta{
	
	private Inventario mochila;
	
	private String posicionMapa;
	
	private String habilidades;
	
	public Personaje(String titulo, String textoDescriptivo, String efectos, Inventario mochila, String posicionMapa, String habilidades) {
		super(titulo, textoDescriptivo, efectos);
		this.mochila = mochila;
		this.posicionMapa = posicionMapa;
		this.habilidades = habilidades;
	}

	
}
