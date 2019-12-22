package com.brain.course.work.dao;

import com.brain.course.work.model.Building;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BuildingRepository extends JpaRepository<Building, Long> {
    @Query("")
    Optional<Building> findUserAccount(String employeeName);
}
