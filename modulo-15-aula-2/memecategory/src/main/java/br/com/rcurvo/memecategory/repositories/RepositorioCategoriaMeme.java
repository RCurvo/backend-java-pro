package br.com.rcurvo.memecategory.repositories;

import br.com.rcurvo.memecategory.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, String> {
}
