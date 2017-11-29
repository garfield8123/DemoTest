
/**
 * Write a description of class ArrayMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main(){

        double total = 0;
        String [] sharingFriends = {
                "Jasper", 
                "Teddie", 
                "Austin", 
                "David", 
                "William" 
            }; 
        for (int i =0; i < 5; i++) {
            System.out.println(sharingFriends[i]);
        }
        int[ ] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        for(int days : daysBtwnPurchase){
            total = total + days;
        }
        System.out.println(total / daysBtwnPurchase.length);

        String [] SongNames = { "The Twist", 
                "Smooth", 
                "Mack The Knife", 
                "How do I live",
                "Party Rock Anthem",
                "I Gotta Feeling",
                "Macarena(Bayside Boys Mix)",
                "Physical",
                "You Light up my Life",
                "Hey Jude",
                "Test"
            };
        double [] SongPrice = {5.6,
                6.8,
                7.7,
                8.6,
                5.5,
                4.4,
                6.5,
                4.3,
                4.5,
                3.3,
                1.6
            };

        int i = 0;
        System.out.println(" ");
        System.out.println("#27");
        System.out.println("For Each Loop");
        //#25
        for (double price: SongPrice) {

            if(i%2 == 0){
                if( i < 11){
                    //SongPrice.indexOf(
                    System.out.println(SongNames[i]+(" ") + ("Price: $")+price);
                    i++;
                }
            }
            else{
                i++;   
            }
        }
        Song [] topTenSongsPrice = { 
                new Song("The Twist", 0.99),
                new Song("Smooth", 1.05),
                new Song("Mack The Knife", 3.45),
                new Song("How do I live", 0.45),
                new Song("Party Rock Anthem", 2.45),
                new Song("I Gotta Feeling", 5.25),
                new Song("Macarena(Bayside Boys Mix)", 0.44),
                new Song("Physical", 2.97),
                new Song("You Light up my life", 5.00),
                new Song("Hey Jude", 0.34),
                new Song("Test", 0.56)
            };
        System.out.println("");
        System.out.println("");

        int index1 = SongFinder.getIndexLastDiscount(topTenSongsPrice, 1.00);
       // System.out.println(topTenSongsPrice[5].getTitle());
        //System.out.println(topTenSongsPrice[5].getPrice());
      /*  System.out.println("index:" + index1);
        System.out.println(topTenSongsPrice[index1].getTitle());
        System.out.println(topTenSongsPrice[index1].getPrice());*/
        //for(int c = 0; c<topTenSongsPrice.length; c++){
        if (index1 >= 0 ) {
            System.out.println("Discount found " + topTenSongsPrice[index1].getTitle());
        }
        else {
            System.out.println("No songs are discounted");
        }
    //}
        Song [] topTenSongs = {
                new Song("The Twist"), 
                new Song("Smooth"),
                new Song("Mack The Knife"),
                new Song("How do I live"),
                new Song("Party Rock Anthem"),
                new Song("I Gotta Feeling"),
                new Song("Macarena(Bayside Boys Mix)"),
                new Song("Physical"),
                new Song("You Light up my life"),
                new Song("Hey Jude"),
                new Song("Test")
            };
        System.out.println(" ");
        System.out.println("");
        int index = SongFinder.findTitle(topTenSongs, "Mack The Knife");

        //System.out.println(topTenSongs[5].getTitle());
        //System.out.println(index);

        if(index>= 0){
            System.out.println("Found" + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("Song not found!");
        }
        System.out.println("");
        System.out.println("");
         System.out.println("--Find last song--");
        int index3 = SongFinder.getIndexLastTitle(topTenSongs);
        System.out.println("index: " + index3);
        if (index3 >= 0){
            System.out.println("Last title: " + topTenSongs[index3].getTitle());
        }
        else {
            System.out.println("You have a blank title!");
        }
        System.out.println(" ");
        System.out.println("#27");
        System.out.println("For Loop");
        for (int a=0; a<10; a+=2){

            //System.out.println(topTenSongs[a]);
            topTenSongs[a].setSong4(SongNames[a], SongPrice[a]);
            //  topTenSongs[a] = SongNames[a], SongPrice[a];
            System.out.println(SongNames[a] +(" ")+ ("$") + SongPrice[a]);

        }
        System.out.println(" ");
        System.out.println("#26");
        for (int a=0; a<5; a++){

            //System.out.println(topTenSongs[a]);
            topTenSongs[a].setSong4(SongNames[a], SongPrice[a]);
            //  topTenSongs[a] = SongNames[a], SongPrice[a];
            System.out.println(SongNames[a] +(" ")+ ("$") + SongPrice[a]);

        }
        System.out.println(" ");
        /*  for (int p=0; p<11; p++){
        System.out.println(topTenSongs[p]);
        topTenSongs[p].setSong4(SongNames[p], SongPrice[p]);

        }*/
        for(Song s: topTenSongs){
            System.out.println(s.getTitle()); 
        }
        System.out.println("-BEFORE--");
        for (Song changeSong : topTenSongs){
            changeSong.setTitle("test");   
        }
        System.out.println("-AFTER--");
        for(Song showSong : topTenSongs){
            System.out.println(showSong.getTitle());   
        }
        for(Song changeSong: topTenSongs){
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());

        }

    }
}
