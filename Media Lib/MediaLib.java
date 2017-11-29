
/**
 * Write a description of class MediaLib here.
 *  IT IS A MEDIA LIBARY
 * @author (your name) ME AND ONLY ME
 * @version (a version number or a date) 20202020202020202020202020202020
 */
public class MediaLib
{
    public static void main(){
        //   private array Song[] NumofSongs;
        int songNumber = 0;
        double totalCost = 0.0;
        System.out.println("Welcome to you Media Libary");
        LoopingMediaLib MediaFile2 = new LoopingMediaLib();
        Song song1 = new Song();
        Song song7 = new Song ();
        Song song2 = new Song ();
        Song song3 = new Song ();
        Song song4 = new Song ();
        Song song5 = new Song();
        Song song6 = new Song();
        Song song8 = new Song();
        Movie hours1 = new Movie();
        Movie minutes1 = new Movie();
        Movie seconds1 = new Movie();
        Movie movie1 = new Movie();
        Book book1 = new Book();
        Song price1 = new Song();
        Song rating1 = new Song();
        Song favorite1 = new Song();

        //System.out.println(song2);
        //System.out.println(song3);
        //System.out.println(favorite1);
        //System.out.println(rating1);
        //System.out.println(price1);
        //System.out.println(movie1);
        //System.out.println(book1);
        //System.out.println(song1);
        hours1.setHours(5);
        minutes1.setMinutes(56);
        seconds1.setSeconds(45);
        song5.setSong3("Lemon tree", 5);
        song6.setSong3("Beijing Welcomes you", 5);
        song3.setSong3("Monday", 8);
        song4.setSong3("Happy Birthday", 9);
        song7.setSong3("Respect", 6);
        song2.setSong3("Hello", 5);
        song1.setSong3("Monday", 7);
        song8.setSong3("Twist", 2);
        favorite1.setFavorite(true);
        rating1.setRating(5);
        price1.setPrice(1.15);
        movie1.setMovie("The blackhat");
        book1.setBook("To Kill a Mocking Bird");
        song1.setTitle("Johnny B. Goode");

        System.out.println("Songs:");
        System.out.println(song4.getTitle());
        System.out.println(song4.getRating());
        //songNumber ++;
        System.out.println(song5.getTitle());
        System.out.println(song5.getRating());
        //songNumber ++;
        System.out.println(song2.getTitle());
        System.out.println(song2.getRating());
        //songNumber ++;
        System.out.println(song3.getTitle());
        System.out.println(song3.getRating());

        /* totalCost += (song5.getPrice());
        totalCost += (song8.getPrice());
        totalCost += (song7.getPrice());
         */
        /* while (songNumber <= 8){
        int X=0;

        //song8.getTitle();
        System.out.println(X);
        X= X+1;
        }
         */

        System.out.println(song6.getTitle());
        System.out.println(song6.getRating());
        System.out.println(song7.getTitle());
        System.out.println(song7.getRating());
        System.out.println(song8.getTitle());
        System.out.println(song8.getRating());
        // songNumber ++;
        System.out.println(song1.getTitle());
        System.out.println(song1.getRating());
        //  songNumber ++;
        /* System.out.println(" ");
        System.out.println(songNumber);
        System.out.println(" ");
         */

        System.out.println(favorite1.getFavorite());
        System.out.println(song1.getTitle());
        String t = song1.getTitle();
        MediaFile.writeString(t);
        MediaFile.writeString(song8.getTitle());
        MediaFile.saveAndClose();
        //String w = song3.getTitle();
        //MediaFile.writeString(w);
        //  MediaFile.writeString(song3.getTitle()+(int)song3.getRating());
        //  MediaFile.writeString((int)song3.getRating());

        MediaFile.writeString(song5.getTitle()+("|")+(int)song5.getRating());
        MediaFile.writeString(song1.getTitle()+("|")+(int)song1.getRating());
        MediaFile.writeString(song4.getTitle()+("|")+(int)song4.getRating());
        MediaFile.writeString(song6.getTitle() +("|")+(int)song6.getRating());
        MediaFile.writeString(song2.getTitle()+("|")+(int)song2.getRating());
        MediaFile.writeString(song3.getTitle()+("|")+(int)song3.getRating());
        MediaFile.writeString(song7.getTitle()+("|")+(int)song7.getRating());
        MediaFile.writeString(song8.getTitle()+("|")+(int)song8.getRating());

        /*MediaFile2.add(song3);
        MediaFile2.add(song4);
        MediaFile2.add(song5);
        MediaFile2.add(song6);
        MediaFile2.add(song7);
        MediaFile2.add(song8);
        System.out.println(MediaFile2);

         */
        // MediaFile.writeInt((int)song3.getRating());
        MediaFile.saveAndClose();
        //  NumofSongs1 = new Song[0];

        // song1 = song3.getTitle();
        /*while (songNumber >=10){
        return; 
        }
         */ 
        // MediaFile.writeString(song3.getTitle());
        // MediaFile.saveAndClose();
        System.out.println(price1.getPrice());
        System.out.println(rating1.getRating());
        System.out.println("");
        System.out.println("book:");
        System.out.println(book1.getBook());
        System.out.println("");
        System.out.println("Movie:");
        System.out.println(movie1.getMovie());
        System.out.println("Hours:");
        System.out.println(hours1.getHours());
        System.out.println("Minutes");
        System.out.println(minutes1.getMinutes()); 
        System.out.println("Seconds");
        System.out.println(seconds1.getSeconds());
        System.out.println("");
        System.out.println("Total Cost:");
        System.out.println(totalCost);
    }
}
