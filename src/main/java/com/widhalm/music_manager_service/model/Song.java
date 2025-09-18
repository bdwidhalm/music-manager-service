package com.widhalm.music_manager_service.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
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

    public Song(String id, String file, String relativePath) {
        super();
        this.id = id;
        this.file = file;
        this.relativePath = relativePath;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id='" + id + '\'' +
                ", file='" + file + '\'' +
                ", relativePath='" + relativePath + '\'' +
                '}';
    }
}
