package com.portal.application;

import com.portal.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AvailabilityRestApiApplicationTests {

private MockMvc mockmvc;



private WebApplicationContext wc;

   @Before
  public void setUp(){
   	mockmvc= MockMvcBuilders.webAppContextSetup(wc).build();
   }
	@Test
	public void addData() {


	}

}
