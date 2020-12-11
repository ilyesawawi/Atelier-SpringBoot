package com.ilyes.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilyes.mobile.entities.Mobile;
import com.ilyes.mobile.repos.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileRepository mobileRepository;
	@Override
	public Mobile saveMobile(Mobile m) {
	return mobileRepository.save(m);
	}
	
	@Override
	public Mobile updateMobile(Mobile m) {
	return mobileRepository.save(m);
	}
	@Override
	public void deleteMobile(Mobile m) {
	mobileRepository.delete(m);
	}
	 @Override
	public void deleteMobileById(Long id) {
	mobileRepository.deleteById(id);
	}
	@Override
	public Mobile getMobile(Long id) {
	return mobileRepository.findById(id).get();
	}
	@Override
	public List<Mobile> getAllMobile() {
	return mobileRepository.findAll();
	}

}
