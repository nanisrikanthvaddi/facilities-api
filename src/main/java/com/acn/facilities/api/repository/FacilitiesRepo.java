package com.acn.facilities.api.repository;

import com.acn.facilities.api.model.FacilitiesInnerJSON;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface FacilitiesRepo extends JpaRepository<FacilitiesInnerJSON, String> {


    @Override
    Optional<FacilitiesInnerJSON> findById(String hci);
}
