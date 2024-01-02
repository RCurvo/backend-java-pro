package br.com.rcurvo.memes.repositories;

import br.com.rcurvo.memes.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RepositorioMeme extends JpaRepository<Meme, String> {

    @Query(value = "SELECT * FROM meme ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Optional<Meme> findRandomMeme();
}
