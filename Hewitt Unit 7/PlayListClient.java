//Comment each of the methods one by one and test each method.  Replace the comments after execution

public class PlayListClient
{
    public static void main(String[]args)
    {
        PlayList jukeBox = new PlayList("Ms. L's School Playlist");
        
        Song s1 = new Song("Don't Stop Me Now", "Queen", 3.27);
        Song s2 = new Song("Jolene", "Dolly Parton", 2.42);
        Song s3 = new Song("Rockaway Beach", "Ramones", 2.04);
        Song s4 = new Song("Photograph", "Def Leppard", 4.07);
        Song s5 = new Song("Kids In America", "Kim Wilde", 3.24);
                
        jukeBox.addSong(s1);
        jukeBox.addSong(s2);
        jukeBox.addSong(s3);
        jukeBox.addSong(s4);
        jukeBox.addSong(s5);
        jukeBox.addSong(new Song("Linger", "The Cranberries", 4.33));
        jukeBox.addSong(new Song("The Logical Song", "SuperTramp", 4.10));//
        
        //jukeBox.print();
        
        //jukeBox.removeLength(3.5);
        //jukeBox.print();
        
        //jukeBox.removeArtist("Ramones");
        //jukeBox.print();
         
        //System.out.println("Number of Songs: " + jukeBox.numberOfSongs());
        
        //jukeBox.shuffle();
        //jukeBox.print();
        
        System.out.println("Total length of playlist: " + jukeBox.totalLength());
    }
}