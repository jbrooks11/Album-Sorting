import java.util.Comparator;

public class Sortbyalbum implements Comparator<Album> {
    public int compare(Album a, Album b){
        return a.getName().compareTo(b.getName());
    }
}
