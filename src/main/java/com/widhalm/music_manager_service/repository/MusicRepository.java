package com.widhalm.music_manager_service.repository;

import com.widhalm.music_manager_service.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MusicRepository extends MongoRepository<Song, String> {

    @Query(value="{}")
    public List<Song> allSongs();

    public long count();
}
