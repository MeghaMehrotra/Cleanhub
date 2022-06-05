package com.cleanhub.api.repository;

import com.cleanhub.api.entity.ProductImage;
import com.cleanhub.api.entity.TrustMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrustMarkRepository extends JpaRepository<TrustMark,Long> {
}

