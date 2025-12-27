package com.pankassi.domain.repository;

import com.pankassi.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {
    /**
     * Already existing methods:
     * - save()
     * - findById()
     * - findAll()
     * - deleteById()
     * - count()
     * - existsBy()
     */

    //Check if email
    boolean findByEmail(String email);

    // Collect password using email
    @Query("SELECT c.password FROM Client WHERE c.email = :email")
    Optional<String> findPasswordByEmail(@Param("email") String email);

}
