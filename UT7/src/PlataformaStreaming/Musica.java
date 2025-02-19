package PlataformaStreaming;

public class Musica implements Reproducible {

	@Override
	public void reproducir() {
		System.out.println("La cancion se esta reproduciendo");
	}

	@Override
	public void pausar() {
	System.out.println("La cancion se ha pausado");
	}

	@Override
	public void ontenerTipoContenido() {
		
		TipoContenido ContenidoMusica = TipoContenido.Musica;
		
		System.out.println("El tipo de contenido es "+ContenidoMusica);
	}

	
	
	
	
}
