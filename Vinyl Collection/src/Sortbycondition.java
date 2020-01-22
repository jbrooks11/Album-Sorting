import java.util.Comparator;

public class Sortbycondition implements Comparator<Album> {
    public int compare(Album a, Album b){
        return a.getCondition().compareTo(b.getCondition());
    }
}
