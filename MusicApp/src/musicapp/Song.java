/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapp;

/**
 *
 * @author zoheb
 */
public class Song {
    private String name;
    private String artist;
    private int durationInSecs;
    private String genre;

    // Constructor
    public Song(String name, String artist, int durationInSeconds, String genre) {
        this.name = name;
        this.artist = artist;
        this.durationInSecs = durationInSeconds;
        this.genre = genre;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDurationInSecs() {
        return durationInSecs;
    }

    public void setDurationInSecs(int durationInSecs) {
        this.durationInSecs = durationInSecs;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

