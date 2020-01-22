import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
import java.lang.String;

public class Albumsorting {
    public static void sortByYear(ArrayList<Album> a) {
        Collections.sort(a, new Sortbyyear());
    }

    public static void sortByArtist(ArrayList<Album> a) {
        Collections.sort(a, new Sortbyartist());
    }

    public static void sortByGenre(ArrayList<Album> a) {
        Collections.sort(a, new Sortbygenre());
    }

    public static void sortByAlbum(ArrayList<Album> a) {
        Collections.sort(a, new Sortbyalbum());
    }

    public static void sortByCondition(ArrayList<Album> a) {
        Collections.sort(a, new Sortbycondition());
    }

    public static void sortByPressing(ArrayList<Album> a) {
        Collections.sort(a, new Sortbypressing());
    }


    public static void main(String[] args) {
      /*  Album darkSideOfTheMoon = new Album("The Dark Side of the Moon", "Pink Floyd", 1973, "Progressive Rock", "NM-", "1st", "original poster included");
        Album harvest = new Album("Harvest", "Neil Young", 1972, "Folk Rock", "VG+", "N/A", "original inserts");
        Album theLastWaltz = new Album("The Last Waltz", "The Band", 1978, "Rock", "NM+", "1st", "N/A");
        Album americanBeauty = new Album("American Beauty", "Grateful Dead", 1970, "Country Rock", "NM-", "1st", "N/A");
        Album skullAndRoses = new Album("Grateful Dead (Skull & Roses) [Live]", "Grateful Dead", 1971, "Psychedelic Rock", "VG", "N/A", "original insert");
        Album lifeAndTimes = new Album("Life And Times", "Jim Croce", 1973, "Folk", "VG+", "1st", "signs of use");
        Album goldenHits = new Album("Elvis' Golden Records", "Elvis Presley", 1958, "Rock", "F", "N/A", "plastic insert");
        Album breakdown = new Album("Breakdown", "Old & In The Way", 1997, "Bluegrass", "G+", "1st", "comes with insert");
        Album allYourFavorite = new Album("All Your Favorite Bands", "Dawes", 2015, "Indie Rock", "NM+", "1st", "insert included");
        Album volunteers = new Album("Volunteers", "Jefferson Airplane", 1969, "Psychedelic Rock", "VG+", "2nd", "what flag?");
        Album surrealisticPillow = new Album("Surrealistic Pillow", "Jefferson Airplane", 1967, "Psychedelic Rock", "NM-", "Green Label", "N/A");
        Album masanaTemples = new Album("Masana Temples", "Kikagaku Moyo", 2018, "Progressive Rock", "NM+", "1st", "colored vinyl");
        Album secondAlbum = new Album("Four Tops Second Album", "The Four Tops", 1965, "Motown", "G", "N/A", "N/A");
        Album raggedGlory = new Album("Ragged Glory", "Neil Young", 1990, "Rock", "NM-", "1st", "N/A");
*/
        ArrayList<Album> albums = new ArrayList<>();

        for (Album a :
                albums) {
            System.out.println(a);
        }


        System.out.println("");
        System.out.println("These are the current albums in your library, would you like to sort them, add an album, " +
                "search for an album or artist, or remove an album?");
        System.out.println("Enter 'sort' to sort, enter 'add' to add an album, enter 'search' to search," +
                " or enter 'remove' to remove an album.");
        Scanner criteria = new Scanner(System.in);
        String userCommand = criteria.nextLine();

        while (true) {
            if (userCommand.equals("sort")) {
                System.out.println("You can sort by album, artist, year, genre, condition, or pressing");
                System.out.println("Type the following to sort by that criteria: 'album', 'artist'," +
                        " 'year', 'genre', 'condition', 'pressing'");
                String userCriteria = criteria.nextLine();
                if (userCriteria.equalsIgnoreCase("artist")) {
                    sortByArtist(albums);
                    for (Album a :
                            albums) {
                        System.out.println(a);
                    }
                }
                if (userCriteria.equalsIgnoreCase("album")) {
                    sortByAlbum(albums);
                    for (Album a :
                            albums) {
                        System.out.println(a);
                    }
                }
                if (userCriteria.equalsIgnoreCase("year")) {
                    sortByYear(albums);
                    for (Album a :
                            albums) {
                        System.out.println(a);
                    }
                }
                if (userCriteria.equalsIgnoreCase("genre")) {
                    sortByGenre(albums);
                    for (Album a :
                            albums) {
                        System.out.println(a);
                    }
                }
                if (userCriteria.equalsIgnoreCase("condition")) {
                    sortByCondition(albums);
                    for (Album a :
                            albums) {
                        System.out.println(a);
                    }
                }
                if (userCriteria.equalsIgnoreCase("pressing")) {
                    sortByPressing(albums);
                    for (Album a :
                            albums) {
                        System.out.println(a);
                    }
                }
            }
            if (userCommand.equalsIgnoreCase("add")) {
                System.out.println("Would you like to add a new album? Yes or No?");
                String userCommand2 = criteria.nextLine();
                if (userCommand2.equalsIgnoreCase("Yes")) {
                    System.out.println("Enter the album title. If unknown, type 'N/A'.");
                    String name = criteria.nextLine().toUpperCase();
                    System.out.println("Enter the artist. If unknown, type 'N/A'.");
                    String artist = criteria.nextLine().toUpperCase();
                    System.out.println("Enter the release year. If unknown, type 'N/A'.");
                    int year = Integer.parseInt(criteria.nextLine().toUpperCase());
                    System.out.println("Enter the genre. If unknown, type 'N/A'.");
                    String genre = criteria.nextLine().toUpperCase();
                    System.out.println("Enter the condition. If unknown, type 'N/A'.");
                    String condition = criteria.nextLine().toUpperCase();
                    System.out.println("Enter the pressing. If unknown, type 'N/A'.");
                    String pressing = criteria.nextLine().toUpperCase();
                    System.out.println("Add notes if applicable. If no notes are needed, type N/A");
                    String notes = criteria.nextLine();
                    Album userAlbum = new Album(name, artist, year, genre, condition, pressing, notes);
                    albums.add(userAlbum);
                    System.out.println(userAlbum);
                }
            }
            if (userCommand.equalsIgnoreCase("search")) {
                System.out.println("Enter either the album name, artist, or genre to search (case sensitive).");
                String userCommand3 = criteria.nextLine();
                Iterator albumIterator = albums.iterator();
                while (albumIterator.hasNext()) {
                    Album temp = (Album) albumIterator.next();
                    if ((temp.getName().contains(userCommand3))) {
                        System.out.println(temp);
                    }
                    if ((temp.getArtist().contains(userCommand3))) {
                        System.out.println(temp);
                    }
                    if ((temp.getGenre().contains(userCommand3))) {
                        System.out.println(temp);
                    }
                }
            }

            if (userCommand.equalsIgnoreCase("remove")) {
                System.out.println("Enter either the album name or artist to remove (case sensitive).");
                String userCommand3 = criteria.nextLine();
                for (int i = 0; i < albums.size(); i++) {
                    Album temp = albums.get(i);
                    if ((temp.getName().contains(userCommand3))) {
                        System.out.println(albums.get(i) + "    INDEX: " + i);
                    }
                    if ((temp.getArtist().contains(userCommand3))) {
                        System.out.println(albums.get(i) + "    INDEX: " + i);
                    }
                }
                while (true) {
                    System.out.println("Would you like to delete an element? Yes or no? If no albums printed, enter 'no'.");
                    String removalCommand = criteria.nextLine();
                    if (removalCommand.equalsIgnoreCase("yes")) {
                        System.out.println("Enter the INDEX number on the right side of the album info to delete the element.");
                        int userCommand4 = Integer.parseInt(criteria.nextLine());
                        System.out.println("You removed: " + albums.get(userCommand4));
                        albums.remove(userCommand4);
                        break;
                    }
                    else if (removalCommand.equalsIgnoreCase("no")) {
                        System.out.println("You did not remove any albums.");
                        break;
                    }
                }
            }

                System.out.println("Would you like to sort, add, search for or remove an album? Answer no to end the loop.");
                userCommand = criteria.nextLine();
                if (userCommand.equalsIgnoreCase("no")) {
                    Scanner writerScanner = new Scanner(System.in);
                    System.out.println("Do you want to export this information to a text file? Yes or no?");
                    String userCommand5 = writerScanner.nextLine();
                    if (userCommand5.equalsIgnoreCase("yes")) {
                        System.out.println("What would you like to name the file? Add extension such as .txt or .doc");
                        String fileName = writerScanner.nextLine();
                        FileWriter fileWriter;
                        try {
                            fileWriter = new FileWriter(fileName, true);
                            Iterator albumIterator = albums.iterator();
                            for (int i = 74; i < albums.size();) {
                                while (albumIterator.hasNext()) {
                                    i++;
                                    fileWriter.write(i + ") " + albumIterator.next().toString() + "\n\n");
                                }
                                fileWriter.close();
                            }
                        }catch (IOException e){
                            System.out.println("IO Exception");
                        }
                        System.out.println("Your new sorted collection is available in your project folder!");
                        break;
                    }
                    else {break;}
                }
                else {System.out.println("Please enter a stated command.");}
            }
        }
    }