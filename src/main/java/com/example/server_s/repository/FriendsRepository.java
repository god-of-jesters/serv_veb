package com.example.server_s.repository;

import com.example.server_s.domain.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends JpaRepository<Friends, Long> {
}