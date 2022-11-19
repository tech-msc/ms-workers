package com.home.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
