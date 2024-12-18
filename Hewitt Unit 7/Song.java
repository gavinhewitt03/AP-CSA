
/**
 * This class creates Song objects for the Playlist class.
 *
 * @author Gavin Hewitt
 * @version 02/22/21
 */

import java.util.*;
public class Song
{
    private String artist, song;
    private double length;
    
    public Song(String s, String a, double l)
    {
        song = s;
        artist = a;
        length = l;
    }
    
    public String getSong()
    {
        return song;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public String toString()
    {
        return "The song is " + song + " by " + artist + " and is " + length + " long.";
    }
}
