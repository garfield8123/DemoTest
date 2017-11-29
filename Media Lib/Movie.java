
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    
    // instance variables - replace the example below with your own
    private String movie;
   int duration;
   private int hours;
   private int minutes;
    private int seconds;
   public int getHours(){
     return hours;   
    }
    public int getMinutes(){
     return minutes;   
    }
    public int getSeconds(){
     return seconds;   
    }
    public void setHours(int h){
        hours = h;
    }
    public void setMinutes(int m){
        minutes = m;
       }
       public void setSeconds(int s){
         seconds = s;  
        }
   public int getDuration(){
       return duration;
    }
    public void setDuration(int d){
        duration = d;
    }
    public void setDuration1(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
   public String getMovie(){
     return movie;   
    }
    public Movie (int h, int m, int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }
    
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        movie = "";
        hours = 2;
        minutes = 56;
        seconds = 45;
        
    }
 
    public void setMovie(String m){
        movie = m;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
 
}
