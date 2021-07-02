package playlist;

import entidades.Musica;
import java.util.ArrayList;

public class NewPlay extends PlaylistBase{

    private ArrayList<Musica> playlist;
    private final String genero;
    private final String nome;

    public NewPlay(String genero, String nome) {
        super(genero);
        this.playlist = new ArrayList<>();
        this.genero = genero;
        this.nome = nome;
    }
    public void addMusica(Musica musica){
        playlist.add(musica);
    }
    public Musica getMusica(Musica musica){
        return playlist.get(playlist.indexOf(musica));
    }
    public Musica getMusica(int indice){
        return playlist.get(indice);
    } 
    public String getNome(){
        return nome;
    }
    public int getSize(){
        return playlist.size();
    }
}