package uas.parkir.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uas.parkir.entity.Parkir;

@Repository
public interface ParkirRepo 
    extends JpaRepository<Parkir, Integer> {
    
}