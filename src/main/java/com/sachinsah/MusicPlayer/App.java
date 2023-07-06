package com.sachinsah.MusicPlayer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app = new App();

    	String[] songs = {"s1", "s2", "s3", "s4", "s5"};
    	Deque<String> recentPlayed = new ArrayDeque<String>();
    	
    	//recent playlist capacity we have taken 3
    	//initally we are adding first 3 songs from the songs list
    	recentPlayed.add(songs[0]);
    	recentPlayed.add(songs[1]);
    	recentPlayed.add(songs[2]);
    	
    	//Peak any random songs
    	app.recentPlaylist(songs[2], recentPlayed);
    }
    
    public Deque<String> recentPlaylist(String newSongPlayed, Deque<String> recentPlayed) {

    	// add new song to playlist only if it is not there recentPlaylist 
    	if(!recentPlayed.contains(newSongPlayed)) {
        	recentPlayed.removeFirst();
        	recentPlayed.addLast(newSongPlayed);    	
    	}
    	
    	return recentPlayed;
    	//System.out.println(recentPlayed);
    }
}
