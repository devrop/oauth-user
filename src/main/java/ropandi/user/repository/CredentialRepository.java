package ropandi.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ropandi.user.entity.MstOauthCredential;
@Repository
public interface CredentialRepository extends JpaRepository<MstOauthCredential, String> {

}
