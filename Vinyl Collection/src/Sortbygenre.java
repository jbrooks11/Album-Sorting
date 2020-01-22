import java.util.Comparator;

public class Sortbygenre implements Comparator<Album> {
    public int compare(Album a, Album b){
        return a.getGenre().compareTo(b.getGenre());
    }
}
