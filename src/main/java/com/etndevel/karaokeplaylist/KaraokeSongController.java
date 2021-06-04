package com.etndevel.karaokeplaylist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class KaraokeSongController {

    private final KaraokeSongService karaokeSongService;

    public KaraokeSongController(KaraokeSongService karaokeSongService) {
        this.karaokeSongService = karaokeSongService;
    }

    @GetMapping
    public String getKaraokeSongList(Model model) {
        model.addAttribute("karaokeSongs", karaokeSongService.getKaraokeSongList());

        return "karaoke-songs";
    }
}
