package com.yuvi.masterapi.repository;

import java.util.Optional;

import com.yuvi.masterapi.auth.ERole;
import com.yuvi.masterapi.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}