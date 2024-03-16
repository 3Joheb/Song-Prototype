package musicapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 *
 * @author zoheb
 */
public class Playlist implements StackInterface {
    private List<Song> songs; // ArrayList to store songs
    
    // Constructor
    public Playlist() {
        songs = new ArrayList<>();
    }
    
    // Check if the playlist is empty
    @Override
    public boolean isEmpty() {
        return songs.isEmpty();
    }
    
    // Check if the playlist is full (not applicable for ArrayList)
    @Override
    public boolean isFull() {
        return false; // ArrayList can grow dynamically, so it's never full
    }
    
    // Push a song onto the playlist
    @Override
    public void push(Song song) {
        songs.add(song);
    }
    
    // Pop the last added song from the playlist
    @Override
    public Song pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return songs.remove(songs.size() - 1);
    }
    
    // Get the number of songs in the playlist
    @Override
    public int size() {
        return songs.size();
    }
    
    // Remove all songs from the playlist
    @Override
    public void emptyStack() {
        songs.clear();
    }
    
    // Display the contents of the playlist
    @Override
    public String displayStack() {
        StringBuilder sb = new StringBuilder();
        sb.append("Playlist:\n");
        for (Song song : songs) {
            sb.append(song.getName()).append(" - ").append(song.getArtist()).append("\n");
        }
        return sb.toString();
    }
}
