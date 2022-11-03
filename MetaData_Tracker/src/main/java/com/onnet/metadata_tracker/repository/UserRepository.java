package com.onnet.metadata_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onnet.metadata_tracker.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{
	UserModel findByos_id(String os_id);
	UserModel findById(long id);

}
