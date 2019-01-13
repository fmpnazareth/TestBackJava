package com.fmpnazareth.expensemagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.fmpnazareth.expensemagement.config.H2TestProfileJPAConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {
		  H2TestProfileJPAConfig.class})
@ActiveProfiles("test")
public class TestBackJavaApplicationTests {

	@Test
	public void contextLoads() {
	}

}

