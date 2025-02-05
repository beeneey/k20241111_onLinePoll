package com.mbcit.k20250121_1_springBoot_JPA01.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Map;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mbcit.k20250121_1_springBoot_JPA01.domain.Gender;
import com.mbcit.k20250121_1_springBoot_JPA01.domain.Member;
import com.mbcit.k20250121_1_springBoot_JPA01.repository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	void test() {
//		log.info("memberRepository: {}", memberRepository);
		System.out.println("MemberRepositoryTest 클래스의 test() 메소드 실행");
		
//		memberRepository.save(new Member(1L, "testData", "홍길동", "a@a.com", "nickname", LocalDateTime.now(), LocalDateTime.now()));
//		memberRepository.save(new Member(2L, "testData", "임꺽정", "b@b.com", "nickname", LocalDateTime.now(), LocalDateTime.now()));
//		memberRepository.save(new Member(3L, "testData", "장길산", "c@c.com", "nickname", LocalDateTime.now(), LocalDateTime.now()));
//		memberRepository.save(new Member(4L, "testData", "일지매", "b@b.com", "nickname", LocalDateTime.now(), LocalDateTime.now()));
		
//		1줄 출력
		log.info("결과: {}", memberRepository.findAll());
//		람다 식을 사용한 여러줄 출력
		memberRepository.findAll().forEach(System.out::println);
	}
	
	@Test
	public void insertAndUpdateTest() {
		System.out.println("MemberRepositoryTest 클래스의 insertAndUpdateTest() 메소드 실행");
		
//		@Column(updatable = false), @Column(insertable = false) 테스트
		System.out.println("@Column(updatable = false), @Column(insertable = false) 테스트");
		
		Member member = new Member();
		member.setName("손오공");
		member.setEmail("son@mbcit.com");
		member.setNickname("원숭이");
		memberRepository.save(member); // insert
		
		Member member2 = memberRepository.findById(1L).orElse(null);
		member2.setName("저팔계");
		memberRepository.save(member2); // update
		
		memberRepository.findAll().forEach(System.out::println);
	}

	@Test
	public void enumTest() {
		System.out.println("MemberRepositoryTest 클래스의 enumTest() 메소드 실행");
		
		Member member = memberRepository.findById(1L).orElse(null);
		member.setGender(Gender.MALE);
		memberRepository.save(member);
		memberRepository.findAll().forEach(System.out::println);
		
		Map<String, Object> map = memberRepository.findRecord();
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
	
}













