package br.com.rcurvo.memes.repositories;

import br.com.rcurvo.memes.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, String> {
}
