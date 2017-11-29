
/**
 * Write a description of class Algoithms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Algoithms
{
    public static void main(){
        int bestRating = 6;
        int bestRating1 = 7;
        int bestRating2 = 8;
        int bestRating3 = 9;
        int bestRating4 = 5;
        //int lastIndex = 9;

        Song [] topTenSongs = {new Song("The Twist", 5), 
                new Song("Smooth", 8),
                new Song("Mack The Knife", 2),
                new Song("How do I live", 7),
                new Song("Party Rock Anthem", 6),
                new Song("I Gotta Feeling", 2),
                new Song("Macarena(Bayside Boys Mix)", 9),
                new Song("Physical", 2),
                new Song("You Light up my life", 5),
                new Song("Hey Jude", 2),
                new Song("Test", 6)
            };

        for(int a = 0; a < topTenSongs.length; a++){
            for (Song number2: topTenSongs){
                if(topTenSongs[a].getRating() == 2){
                    System.out.println("Number 2 Songs: " + a);
                    System.out.println(topTenSongs[a].getTitle());
                }
            }
            System.out.println(topTenSongs[a].getTitle() + " " +topTenSongs[a].getRating());
            if (bestRating == topTenSongs[a].getRating()){
                System.out.println("Best Rating: " + topTenSongs[a].getTitle());
            }
            else if (bestRating1 == topTenSongs[a].getRating()){
                System.out.println("Best Rating: " + topTenSongs[a].getTitle());
            }
            else if (bestRating2 == topTenSongs[a].getRating()){
                System.out.println("Best Rating: " + topTenSongs[a].getTitle());
            }
            else if (bestRating3 == topTenSongs[a].getRating()){
                System.out.println("Best Rating: " + topTenSongs[a].getTitle());
            }
            else if (bestRating4 == topTenSongs[a].getRating()){
                System.out.println("Best Rating: " + topTenSongs[a].getTitle());
            }
            else {
                System.out.println("Least Rating: " + topTenSongs[a].getTitle());
            }

        }
        int i;
        System.out.println(topTenSongs);

        for (i = topTenSongs.length -1; i >= 0; i--) {
            // skip if no title
            System.out.println("i value: " + i);
            System.out.println(topTenSongs[i].getTitle());
            if(topTenSongs[2] != null){
                System.out.println(topTenSongs[4].getTitle());
            }
            else if (topTenSongs[i].getTitle().equals("")) {
                System.out.println(topTenSongs[i].getTitle());
            }
            else if (topTenSongs == null) {
                System.out.println("null");
            }
            else{
                System.out.println(i);
            }
        }
        for (i = 0; i <= topTenSongs.length; i++) {
            // skip if no title
            System.out.println("i value: " + i);
            System.out.println(topTenSongs[i].getTitle());
            if(topTenSongs[2] != null){
                System.out.println(topTenSongs[4].getTitle());
            }
            else if (topTenSongs[i].getTitle().equals("")) {
                System.out.println(topTenSongs[i].getTitle());
            }
            else if (topTenSongs == null) {
                System.out.println("null");
            }
            else{
                System.out.println(i);
            }
        }
    }
}