public class Album {

    private String name;
    private String artist;
    private int year;
    private String genre;
    private String condition;
    private String pressing;
    private String notes;

    public Album(String name, String artist, int year, String genre,
                 String condition, String pressing, String notes) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.condition = condition;
        this.pressing = pressing;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getCondition() {
        return condition;
    }

    public String getPressing() {
        return pressing;
    }

    public String getNotes() {return notes;}

    public String toString() {
        return "Artist: " + artist + ", Album: " + name + ", Year: " + year + ", Genre: " + genre +
                ", Condition: " + condition + ", Pressing: " + pressing +  "\n   Additional notes: " + notes;
    }
}