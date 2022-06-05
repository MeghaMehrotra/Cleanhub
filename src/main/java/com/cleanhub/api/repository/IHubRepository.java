package com.cleanhub.api.repository;

import com.cleanhub.api.entity.Hub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHubRepository extends JpaRepository<Hub,Long> {
}
