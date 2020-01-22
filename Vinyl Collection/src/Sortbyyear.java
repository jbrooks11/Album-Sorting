import java.util.Comparator;

public class Sortbyyear implements Comparator<Album> {
    public int compare(Album a, Album b){
        return a.getYear() - b.getYear();
    }
}
