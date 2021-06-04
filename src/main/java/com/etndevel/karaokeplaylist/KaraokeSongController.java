package com.etndevel.karaokeplaylist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

        KaraokeSong karaokeSong = new KaraokeSong();
        model.addAttribute("karaokeSong", karaokeSong);

        return "karaoke-songs";
    }

    @PostMapping("/add")
    public String addKaraokeSong(@ModelAttribute KaraokeSong karaokeSong, Model model) {
        karaokeSongService.saveOrUpdate(karaokeSong);

        model.addAttribute("karaokeSongs", karaokeSongService.getKaraokeSongList());
        model.addAttribute("karaokeSong", karaokeSong);

        return "karaoke-songs";
    }
}
