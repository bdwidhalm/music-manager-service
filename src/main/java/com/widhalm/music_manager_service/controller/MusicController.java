package com.widhalm.music_manager_service.controller;

import com.widhalm.music_manager_service.model.Song;
import com.widhalm.music_manager_service.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    MusicRepository musicRepository;

    @GetMapping("/songs")
    public String getAllSongs() {
        List<Song> songs = musicRepository.allSongs();
        System.out.println("Count:  " + musicRepository.count());
        return songs.toString();
    }
}
