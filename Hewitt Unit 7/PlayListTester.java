//Comment each of the methods one by one and test each method.  
//Replace the comments after execution

public class PlayListTester
{
    public static void main(String[]args)
    {
        PlayList jukeBox = new PlayList("Pop Music");
        
        Song s1 = new Song("Locked out of Heaven", "Bruno Mars", 3.5);
        Song s2 = new Song("Diamonds", "Rhianna", 4.2);
        Song s3 = new Song("I Knew you were Trouble", "Taylor Swift", 4.1);
        Song s4 = new Song("One More Night", "Maroon 5", 3.4);
        Song s5 = new Song("Girl on Fire", "Alicia Keys", 4.35);
                
        jukeBox.addSong(s1);
        jukeBox.addSong(s2);
        jukeBox.addSong(s3);
        jukeBox.addSong(s4);
        jukeBox.addSong(s5);
        jukeBox.addSong(new Song("Gangnam Style", "PSY", 4.20));
        jukeBox.addSong(new Song("Payphone", "Maroon 5", 3.75));//
        
        /*jukeBox.removeLength(3.6);
        jukeBox.print();*/
        
        /*jukeBox.removeArtist("maroon 5");
        jukeBox.print();*/
         
        //System.out.println("Number of Songs: " + jukeBox.numberOfSongs());
        
        /*jukeBox.shuffle();
        jukeBox.print();*/
        
        //System.out.println("Total length of playlist: " + jukeBox.totalLength());
    }
}