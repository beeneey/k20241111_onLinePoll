package com.mbcit.k20250121_1_springBoot_JPA01;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest
class HomeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void testHome() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
			.andDo(print())
			.andExpectAll(status().isOk())
			.andExpect(content().string("springBoot JPA"));
	}

}
