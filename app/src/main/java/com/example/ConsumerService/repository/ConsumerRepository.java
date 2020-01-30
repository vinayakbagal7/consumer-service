package com.example.ConsumerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ConsumerService.model.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Long>{

	Consumer findByName(String name);
}
