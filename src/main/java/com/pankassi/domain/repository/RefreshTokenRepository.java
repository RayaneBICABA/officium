package com.pankassi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pankassi.domain.model.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>{

}
