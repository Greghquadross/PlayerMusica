package playlist;

import entidades.Musica;
import java.util.ArrayList;

public abstract class PlaylistBase {

    private ArrayList<Musica> playlist;
    private final String genero;

    public PlaylistBase(String genero) {
        this.playlist = new ArrayList<>();
        this.genero = genero;
    }

    public abstract void addMusica(Musica musica);

    public abstract Musica getMusica(Musica musica) throws Exception;

    public abstract Musica getMusica(int indice) throws Exception;

    public String getGenero() {
        return this.genero;
    }

}
