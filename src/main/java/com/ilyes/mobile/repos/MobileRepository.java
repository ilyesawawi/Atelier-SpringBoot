package com.ilyes.mobile.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ilyes.mobile.entities.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Long> {
	

}
