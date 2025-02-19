package PlataformaStreaming;

public class Pelicula implements Reproducible {
	@Override
	public void reproducir() {
		System.out.println("La Pelicula se esta reproduciendo");
	}

	@Override
	public void pausar() {
	System.out.println("La Pelicula se ha pausado");
	}

	@Override
	public void ontenerTipoContenido() {
		
		TipoContenido ContenidoPelicula = TipoContenido.Pelicula;
		
		System.out.println("El tipo de contenido es "+ContenidoPelicula);
	}

	

}
