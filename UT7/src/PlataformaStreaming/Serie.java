package PlataformaStreaming;

public class Serie implements Reproducible{
	@Override
	public void reproducir() {
		System.out.println("La Serie se esta reproduciendo");
	}

	@Override
	public void pausar() {
	System.out.println("La Serie se ha pausado");
	}

	@Override
	public void ontenerTipoContenido() {
		
		TipoContenido ContenidoSerie = TipoContenido.Serie;
		
		System.out.println("El tipo de contenido es "+ContenidoSerie);
	}

	
}
