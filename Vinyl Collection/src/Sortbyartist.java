import java.util.Comparator;

public class Sortbyartist implements Comparator<Album> {
    public int compare(Album a, Album b){
        return a.getArtist().compareTo(b.getArtist());
    }
}
