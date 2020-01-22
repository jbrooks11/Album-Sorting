import java.util.Comparator;

public class Sortbypressing implements Comparator<Album> {
    public int compare(Album a, Album b){
        return a.getPressing().compareTo(b.getPressing());
    }
}
