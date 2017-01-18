package com.money.test.enterprise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.money.controller.enterprise.EnterpriseController;
import com.money.model.enterprise.Enterprise;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnterpriseControllerTests {

	@Autowired
	private EnterpriseController controller;

	@Test
	public void save() throws Exception {
		//Enterprise enterprise = new Enterprise("Angeloni");
		//controller.save(enterprise);
	}

}
