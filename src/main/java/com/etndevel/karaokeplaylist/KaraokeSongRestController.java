package com.etndevel.karaokeplaylist;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playlist")
public class KaraokeSongRestController {
    private KaraokeSongService karaokeSongService;

    public KaraokeSongRestController(KaraokeSongService karaokeSongService) {
        this.karaokeSongService = karaokeSongService;
    }

    @PostMapping
    public KaraokeSong createKaraokeSong(@RequestBody KaraokeSong karaokeSong) {
        return karaokeSongService.saveOrUpdate(karaokeSong);
    }

    @PutMapping
    public KaraokeSong updateKaraokeSong(@RequestBody KaraokeSong karaokeSong) {
        return karaokeSongService.saveOrUpdate(karaokeSong);
    }

    @DeleteMapping("/playlist/{id}")
    public KaraokeSong deleteKaraokeSongById(@PathVariable long id) {
        return karaokeSongService.deleteById(id);
    }
}
