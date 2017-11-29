
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class LoopingMediaLib
{
 
           public static void main(){
             String songInfo;
             int pos = 0;
             int posend = 0;
             int songNumber =0;
             double ratingSum = 0.0;
        for(songNumber= 0; songNumber < 957; songNumber++){
            String title = " ";
            String rating = " ";
            
            pos = 0;
            songInfo = MediaFile.readString();
            posend = songInfo.indexOf("|", pos);
            title = songInfo.substring(pos,posend);
            pos = posend+1;
            rating = songInfo.substring(pos);
            ratingSum += Double.valueOf(rating);
           
            System.out.println("song Number: " + songNumber);
            System.out.println("Title: " + title);
            System.out.println("rating: " + rating);
         
            MediaFile.writeString1("title: " + title);
            MediaFile.writeString1("rating: " + rating);
    }
    MediaFile.writeString1("Number of songs is: " + songNumber);
    double average = ratingSum / (double)songNumber;
    System.out.println("Total Number of Songs: " + songNumber);
    System.out.println("average rating: " + average);
    MediaFile.writeString1("The average rating is: " + average);
    MediaFile.saveAndClose();
}
}
