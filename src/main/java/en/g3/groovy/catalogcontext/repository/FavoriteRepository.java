package en.g3.groovy.catalogcontext.repository;

import en.g3.groovy.catalogcontext.domain.Favorite;
import en.g3.groovy.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
    List<Favorite> findAllByUserEmailAndSongPublicIdIn(String email, List<UUID> songPublicIds);
}
