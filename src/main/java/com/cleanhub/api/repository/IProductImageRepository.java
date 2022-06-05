package com.cleanhub.api.repository;

import com.cleanhub.api.entity.CompanyLogo;
import com.cleanhub.api.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductImageRepository extends JpaRepository<ProductImage,Long> {
}
