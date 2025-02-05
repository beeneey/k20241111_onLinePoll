package com.mbcit.k20250121_1_springBoot_JPA01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//	@Controller
@RestController
public class HomeController {

//	@RequestMapping("/")
//	public @ResponseBody String home() {
//		return "springBoot JPA";
//	}
	
	@GetMapping("/")
	public String home() {
		log.info("springBoot JPA");
		return "springBoot JPA";
	}
	
}
