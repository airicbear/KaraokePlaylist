package com.etndevel.karaokeplaylist;

import javax.persistence.*;

@Table(name = "KARAOKE_SONG")
@Entity
public class KaraokeSong {
    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ARTIST")
    private String artist;

    @Column(name = "URL")
    private String url;

    public KaraokeSong() {
    }

    public KaraokeSong(Long id, String title, String artist, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "KaraokeSong{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}