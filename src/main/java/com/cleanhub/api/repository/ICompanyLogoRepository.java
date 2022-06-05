package com.cleanhub.api.repository;

import com.cleanhub.api.entity.CompanyLogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyLogoRepository extends JpaRepository<CompanyLogo,Long> {
}
