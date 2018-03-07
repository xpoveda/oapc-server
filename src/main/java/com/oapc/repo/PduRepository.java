package com.oapc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;

import com.oapc.model.PDU;

public interface PduRepository extends JpaRepository<PDU, Long> {
	
	@Query("select p from PDU p")
	List<PDU> findAllList();
	
	@Query("select p from PDU p order by id")
	Stream<PDU> findAllStream();
	
}