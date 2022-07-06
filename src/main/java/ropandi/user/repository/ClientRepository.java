package ropandi.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ropandi.user.entity.MstOauthClient;
@Repository
public interface ClientRepository extends JpaRepository<MstOauthClient, Long>{

	@Query("SELECT m FROM MstOauthClient m WHERE m.clientId = :clientId")
	Optional<MstOauthClient> findByClientId(@Param("clientId") String clientId);
}
