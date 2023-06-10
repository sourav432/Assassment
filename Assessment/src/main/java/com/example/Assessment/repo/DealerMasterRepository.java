package com.example.Assessment.repo;

import com.example.Assessment.entity.DealerMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DealerMasterRepository extends JpaRepository<DealerMaster, Long> {
    @Query(value = "SELECT * FROM dealer_master WHERE active = true", nativeQuery = true)
    Page<DealerMaster> findAllActiveDealers(Pageable pageable);
}