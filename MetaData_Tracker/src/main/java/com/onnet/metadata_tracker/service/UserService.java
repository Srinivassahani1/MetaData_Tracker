package com.onnet.metadata_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onnet.metadata_tracker.model.UserModel;
import com.onnet.metadata_tracker.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public UserModel saveUser(UserModel user) {
		return userRepository.save(user);
	}
	
	public UserModel getUserByOsId(String os_id) {
		return userRepository.findByos_id(os_id);
	}
	
	public UserModel getUserById(long id) {
		return userRepository.findById(id);
	}
	
	public List<UserModel> getAllUser() {
		return userRepository.findAll();
	}
	
	public String deleteUser(long id) {
		userRepository.deleteById(id);
		return "removed user!!" +id;
	}
	
	public UserModel updateUser(UserModel user) {
		UserModel userDetails = userRepository.findById(user.getId());
		userDetails.setOs_id(user.getOs_id());
		userDetails.setName(user.getName());
		userDetails.setPhone_no(user.getPhone_no());
		userDetails.setEmail(user.getEmail());
		userDetails.setInstitute(user.getInstitute());
		userDetails.setStatus(user.getStatus());
		userDetails.setUsertype(user.getUsertype());
		userDetails.setDelete_id(user.getDelete_id());
		return userRepository.save(userDetails);
	}
	
}
