package com.widhalm.music_manager_service.controller;

import com.widhalm.music_manager_service.model.Song;
import com.widhalm.music_manager_service.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
public class SongController {

    @Autowired
    MusicRepository musicRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/songs")
    public ResponseEntity<List<Song>> getAllSongs() {
        List<Song> songs = musicRepository.allSongs();
        System.out.println("Count:  " + musicRepository.count());
        System.out.println("   Songs......");
        System.out.println(songs);
        return new ResponseEntity<>(songs, HttpStatus.OK);
    }
}
