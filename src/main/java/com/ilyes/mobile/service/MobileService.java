package com.ilyes.mobile.service;

import java.util.List;

import com.ilyes.mobile.entities.Mobile;

public interface MobileService {

	Mobile saveMobile(Mobile m);
	Mobile updateMobile(Mobile m);
	void deleteMobile(Mobile m);
	 void deleteMobileById(Long id);
	 Mobile getMobile(Long id);
	List<Mobile> getAllMobile();


}
