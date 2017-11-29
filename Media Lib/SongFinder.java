
/**
 * Write a description of class SongFinder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SongFinder
{
    public static int findTitle(Song [] topTenSongs, String target){
        System.out.println(topTenSongs.length);
        //System.out.println(topTenSongs[6].getTitle());
        for (int i = 0; i < topTenSongs.length; i++){

            String word = topTenSongs[i].getTitle();
            //System.out.println(topTenSongs[i].getTitle());
            System.out.println(word);
            System.out.println(i);
            //System.out.println(target);
            if (word.equals(target)) {
                return i;
            }
            //else return -1;

        }

        return -1;
    }

    public static int getIndexLastDiscount(Song[] songs, double compare){
        if (songs == null) return -1;
        //System.out.println(songs);
        //System.out.println("Compare:" + compare);

        int found = -1;
        for (int i = songs.length -1; i >=0; i--) {
            if (songs[i].getPrice() < compare) {
                found = i;
                //System.out.println("found:" + found);

            }
            // else {
            //   found = -1; // to show none found
            //}
            //System.out.println(i);

        }
        return found;
        //return found;
    }

    public static int getIndexLastTitle(Song[] songs)
    {
       
        int i;
        System.out.println(songs);
        
        if (songs == null) {
            return -1;
        }
        for (i = songs.length -1; i >= 0; i--) {
            // skip if no title
            System.out.println("i value: " + i);
             System.out.println(songs[i].getTitle());
            if (songs[i].getTitle().equals("")) {
                return -1;
               
            }
            else{
                return i;
            }
        }
        return i;
    }
}

