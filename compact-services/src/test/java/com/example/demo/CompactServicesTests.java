package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CompactServices.class)
//@WebMvcTest(ServiceOneController.class)
public class CompactServicesTests {

	@Test
	public void contextLoads() {

//		RestTemplate restTemplate = new RestTemplate();
//		String result = restTemplate.getForObject("http://127.0.0.1:8083/pingone", String.class);
//		Assert.assertEquals("aping from service one", result);
//
//		result = restTemplate.getForObject("http://localhost:8083/pingtwo", String.class);
//		Assert.assertEquals("ping from service one", result);

	}

}
