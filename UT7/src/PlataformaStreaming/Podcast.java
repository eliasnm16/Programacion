package PlataformaStreaming;

public class Podcast implements Reproducible {
	@Override
	public void reproducir() {
		System.out.println("El podcast se esta reproduciendo");
	}

	@Override
	public void pausar() {
	System.out.println("El podcast se ha pausado");
	}

	@Override
	public void ontenerTipoContenido() {
		
		TipoContenido ContenidoPodcast = TipoContenido.Podcast;
		
		System.out.println("El tipo de contenido es "+ContenidoPodcast);
	}

	
}
