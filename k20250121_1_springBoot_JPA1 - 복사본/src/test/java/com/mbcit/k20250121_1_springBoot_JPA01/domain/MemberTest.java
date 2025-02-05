package com.mbcit.k20250121_1_springBoot_JPA01.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.mbcit.k20250121_1_springBoot_JPA01.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j // lombok이 지원하는 log 출력
class MemberTest {

	@Test
	void test() {
		Member member = new Member();
		member.setName("홍길동");
		member.setEmail("a@a.com");
		member.setCreateDate(LocalDateTime.now());
		member.setUpdateDate(LocalDateTime.now());
		System.out.println("member: " + member);
		log.info("member: {}", member);
		
		Member member2 = new Member("임꺽정", "b@b.com");
		member2.setCreateDate(LocalDateTime.now());
		member2.setUpdateDate(LocalDateTime.now());
		log.info("member2: {}", member2);
		
		Member member3 = new Member(
				1L, "테스트", "장길산", "c@c.com", "도적넘", 
				LocalDateTime.now(), LocalDateTime.now(), Gender.FEMALE);
		log.info("member3: {}", member3);
		
		Member member4 = Member.builder()
				.name("일지매")
				.email("d@d.com")
//				.createDate(LocalDateTime.now())
//				.updateDate(LocalDateTime.now())
				.build();
		log.info("member4: {}", member4);
	}

}















