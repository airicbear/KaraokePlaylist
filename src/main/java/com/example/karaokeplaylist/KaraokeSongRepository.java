package com.example.karaokeplaylist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KaraokeSongRepository extends JpaRepository<KaraokeSong, Long> {
}