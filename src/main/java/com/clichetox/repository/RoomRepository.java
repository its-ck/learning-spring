package com.clichetox.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clichetox.model.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
