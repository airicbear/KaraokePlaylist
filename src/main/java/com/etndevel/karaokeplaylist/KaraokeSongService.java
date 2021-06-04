package com.etndevel.karaokeplaylist;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaraokeSongService {
    private final KaraokeSongRepository karaokeSongRepository;

    public KaraokeSongService(KaraokeSongRepository karaokeSongRepository) {
        this.karaokeSongRepository = karaokeSongRepository;
    }

    public List<KaraokeSong> getKaraokeSongList() { return karaokeSongRepository.findAll(); }

    public KaraokeSong getById(long id) {
        return karaokeSongRepository.findById(id).orElse(new KaraokeSong());
    }

    public KaraokeSong saveOrUpdate(KaraokeSong karaokeSong) {
        karaokeSongRepository.save(karaokeSong);
        return karaokeSong;
    }
}
