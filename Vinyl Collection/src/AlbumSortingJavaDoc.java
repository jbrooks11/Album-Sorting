public class AlbumSortingJavaDoc {
    /** sortByYear - creates new Sortbyyear method.
     * sortByArtist - creates new Sortbyartist method.
     * sortByGenre - creates new Sortbygenre method.
     * sortByAlbum - creates new Sortbyalbum method.
     * sortByCondition - creates new Sortbycondition method.
     * sortByPressing - creates new Sortbypressing method.
     **/

    /**
     * MAIN METHOD
     *
     *
     * The beginning of the main method is the creation of the defualt albums that are in the ArrayList albums.
     *
     * It then prints out the vinyl in the default order in which they were added into albums.
     * The next part prompts the user to enter a command, each one will prompt a certain if statement.
     *
     * While loop.
     * if the user enters 'sort.'
     *      The user can either sort by album, genre, artist, year, condition, or pressing.
     *      Depending on which one is entered, the user's albums will be sorted by the 'sortByX' methods created above.
     * if the user enters 'add'
     *      It asks the user a second time, so if they accidentally typed add the first time, they can change their mind.
     *      If they enter yes, they will be prompted to enter the information, condition, artist, album name, etc
     * if the user enters 'search'
     *      The user is prompted to enter either the name of the album or the artist.
     *      This if statement uses an iterator to move through the ArrayList to find elements that contain the information the user is looking for.
     * if the user enters 'remove'
     *      Similar to the 'search' method, but instead of an iterator it uses a while loop.
     *      The program prints out the albums that match the user's search, but in addition prints the index of the album in albums.
     *          The user is then asked to enter the index they would like to delete, if they chose.
     * if the user enters 'no'
     *      This will ask the user if they want to create a text file with their newly sorted data.
     *      If they answer yes, the program uses a file writer to create a file of their choice with the information in it.
     */
}
