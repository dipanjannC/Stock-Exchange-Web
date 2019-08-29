package com.stock.web.service;

import com.stock.web.model.User;
import com.stock.web.model.UserPojo;
import com.stock.web.dao.UserRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	@Override
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public User save(UserPojo user) {
		// TODO Auto-generated method stub
		User newUser = new User();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setUsertype(user.getUsertype());
		newUser.setEmail(user.getEmail());
		newUser.setMobileNumber(user.getMobileNumber());
		newUser.setConfirmed(user.isConfirmed());

		return userRepository.save(newUser);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

		userRepository.deleteById(id);
	}

	@Override
	public User findOne(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

	@Override
	public UserPojo update(UserPojo userPojo) {
		// TODO Auto-generated method stub
		User user = findById(userPojo.getUserId());
		if (user != null) {
			BeanUtils.copyProperties(userPojo, user, "password");
			userRepository.save(user);
		}
		return userPojo;
	}

}
