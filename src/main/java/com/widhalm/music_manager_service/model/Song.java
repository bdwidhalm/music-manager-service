package com.widhalm.music_manager_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("songs")
public class Song {

    @Id
    private String id;

    private String file;
    private String relativePath;
    private String album;
    private String album_artist;
    private String artist;
    private String best_release_date;
    private String genre;
    private String non_std_genre;
    private String original_release_date;
    private String publisher;
    private String recording_date;
    private String release_date;
    private String title;
    private String track_num;

    public Song() {}

    public Song(String id, String file, String relativePath, String album, String album_artist, String artist, String best_release_date, String genre, String non_std_genre, String original_release_date, String publisher, String recording_date, String release_date, String title, String track_num) {
        this.id = id;
        this.file = file;
        this.relativePath = relativePath;
        this.album = album;
        this.album_artist = album_artist;
        this.artist = artist;
        this.best_release_date = best_release_date;
        this.genre = genre;
        this.non_std_genre = non_std_genre;
        this.original_release_date = original_release_date;
        this.publisher = publisher;
        this.recording_date = recording_date;
        this.release_date = release_date;
        this.title = title;
        this.track_num = track_num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbum_artist() {
        return album_artist;
    }

    public void setAlbum_artist(String album_artist) {
        this.album_artist = album_artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getBest_release_date() {
        return best_release_date;
    }

    public void setBest_release_date(String best_release_date) {
        this.best_release_date = best_release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNon_std_genre() {
        return non_std_genre;
    }

    public void setNon_std_genre(String non_std_genre) {
        this.non_std_genre = non_std_genre;
    }

    public String getOriginal_release_date() {
        return original_release_date;
    }

    public void setOriginal_release_date(String original_release_date) {
        this.original_release_date = original_release_date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getRecording_date() {
        return recording_date;
    }

    public void setRecording_date(String recording_date) {
        this.recording_date = recording_date;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTrack_num() {
        return track_num;
    }

    public void setTrack_num(String track_num) {
        this.track_num = track_num;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id='" + id + '\'' +
                ", file='" + file + '\'' +
                ", relativePath='" + relativePath + '\'' +
                ", album='" + album + '\'' +
                ", album_artist='" + album_artist + '\'' +
                ", artist='" + artist + '\'' +
                ", best_release_date='" + best_release_date + '\'' +
                ", genre='" + genre + '\'' +
                ", non_std_genre='" + non_std_genre + '\'' +
                ", original_release_date='" + original_release_date + '\'' +
                ", publisher='" + publisher + '\'' +
                ", recording_date='" + recording_date + '\'' +
                ", release_date='" + release_date + '\'' +
                ", title='" + title + '\'' +
                ", track_num='" + track_num + '\'' +
                '}';
    }
}
