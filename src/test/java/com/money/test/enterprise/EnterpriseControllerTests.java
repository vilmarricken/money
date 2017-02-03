package com.money.test.enterprise;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.mazo.money.controller.enterprise.EnterpriseController;
import com.mazo.money.model.enterprise.Payee;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class EnterpriseControllerTests {

	@Autowired
	private EnterpriseController controller;

	@Test
	public void save() throws Exception {
		Payee enterprise = new Payee("Angeloni");
		controller.save(enterprise);
		assertNotNull(enterprise.getOid());
	}

}
