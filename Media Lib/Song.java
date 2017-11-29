
/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private String title;
    private int rating;
    private double price;
    private boolean favorite;

    public boolean getFavorite(){
        return favorite;   
    }

    public double getPrice(){
        return price;

    }

    public void setFavorite(boolean f){
        favorite = f;

    }

    public void setPrice(double p) {
        price = p;

    }

    public void setSong (String title){
        this.title = title;   
    }

    public void setSong2(String title, double price, int rating){
        this.title = title;
        this.price = price;
        this.rating = rating;

    }

    public void setSong3(String title, int rating) {
        this.rating = rating;
        this.title = title;

        
    }

    public void setSong4(String title, double price){
        this.title = title;
        this.price = price;

    }
    
    public int getRating(){

        return rating;
    }

    public String getTitle(){
        return title;

    }
    public Song (String title){
        this.title = title; 
    }
    public Song(double price){
     this.price = price;   
    }
    public Song (String title, double price){
        this.title = title;
        this.price = price;

    }
    public Song (String title, int rating){
        this.rating = rating;
        this.title = title;

    }
    public Song (String title, double price, int rating){
        //this.title = "";
        //this.price = 1.98;
        //this.rating = 10;
        this.title = title;
        this.price = price;
        this.rating = rating;

    }
    public Song()
    {
        // initialise instance variables
        title = title;
        favorite = true;
    }

    public void setRating(int r){
        rating = r;
    }

    public void setTitle(String t){
        title = t;

    }
}