package com.ilyes.mobile;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ilyes.mobile.entities.Mobile;
import com.ilyes.mobile.repos.MobileRepository;

@SpringBootTest
class MobileApplicationTests {
	@Autowired
	private MobileRepository mobileRepository;
	@Test
	public void testCreateMobile() {
	Mobile mob = new Mobile("PC Dell",2200.500,new Date());
	mobileRepository.save(mob);
	}
	
	@Test
	public void testFindMobile() {
		Mobile m = mobileRepository.findById(1L).get();
		System.out.println(m);
	}
	
	@Test
	public void testUpdateMobile()
	{
	Mobile m = mobileRepository.findById(1L).get();
	m.setPrixMobile(1000.0);
	mobileRepository.save(m);
	}
	@Test
	public void testDeleteProduit()
	{
		mobileRepository.deleteById(1L);;
		}

		@Test
		public void testListerTousProduits()
		{
		List<Mobile> mobs = mobileRepository.findAll();
		for (Mobile m : mobs)
	
		System.out.println(m);
		}
		}



