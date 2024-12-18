
/**
 * This class creates PlayList objects and their prespective methods.
 *
 * @author Gavin Hewitt
 * @version 02/22/21
 */
import java.util.*;
public class PlayList
{
    private ArrayList<Song> tunes;
    private String name;
    
    public PlayList(String n)
    {
        name = n;
        tunes = new ArrayList();
    }
    
    public void addSong(Song s)
    {
        tunes.add(s);
    }
    
    public int numberOfSongs()
    {
        return tunes.size();
    }
    
    public double totalLength()
    {
        double sum = 0;
        for(Song x : tunes)
        {
            sum += x.getLength();
        }
        return sum;
    }
    
    public void removeArtist(String a)
    {
        for(int i = 0; i < tunes.size(); i++)
        {
            if(tunes.get(i).getArtist().equalsIgnoreCase(a))
            {
                tunes.remove(i);
                i--;
            }
        }
    }
    
    public void removeLength(double l)
    {
        for(int i = 0; i < tunes.size(); i++)
        {
            if(tunes.get(i).getLength() < l)
            {
                tunes.remove(i);
                i--;
            }
        }
    }
    
    public void shuffle()
    {
        for(int i = 0; i < tunes.size(); i++)
        {
            int randomIndex = (int)(Math.random() * tunes.size());
            Song temp = tunes.get(randomIndex);
            tunes.set(randomIndex, tunes.get(i));
            tunes.set(i, temp);
        }
    }
    
    public void print()
    {
        for(Song x : tunes)
        {
            System.out.println("Song: " + x.getSong() + "  Artist: " + x.getArtist() + "  Length: " + x.getLength());
        }
    }
}
