package com.clichetox.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clichetox.model.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
