
package player;

import entidades.Musica;
import playlist.PlaylistBase;

public interface InterfacePlayerBar {
    
    public void addPlaylist(PlaylistBase playlist);
    
    public PlaylistBase getPlaylist(int indice) throws Exception;
    
    public PlaylistBase getPlaylist(PlaylistBase playlist) throws Exception;
    
    public Musica getMusicaAtual();
    
    public boolean tocandoUltimaMusica();
    
    public boolean tocandoPrimeiraMusica();
    
    public Musica proximaMusica();
    
    public Musica musicaAnterior();
    
}
