package com.etndevel.karaokeplaylist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "playlist", itemResourceRel = "song", path = "playlist")
public interface KaraokeSongRepository extends JpaRepository<KaraokeSong, Long> {
}