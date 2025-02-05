package com.mbcit.k20250121_1_springBoot_JPA01.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mbcit.k20250121_1_springBoot_JPA01.domain.Member;

//	JpaRepository 인터페이스를 상속받아 Member 엔티티의 Repository로 사용할 인터페이스를 선언한다.
//	JpaRepository<엔티티 클래스, 엔티티 클래스에서 기본키로 사용할 필드의 자료형>
//	JpaRepository 인터페이스에서 제공되는 메소드를 살펴보려면 JpaRepository 인터페이스 이름을
//	ctrl 키를 누른 상태로 클릭하면 JpaRepository 인터페이스가 열리고 메소드가 표시된다.
//	Repository 인터페이스는 별다른 어노테이션을 붙이지 않아도 springBoot가 자동으로 bean을 만든다.
public interface MemberRepository extends JpaRepository<Member, Long> {

//	네이티브 쿼리
	@Query(value = "select * from member2 limit 1;", nativeQuery = true)
	Map<String, Object> findRecord();
	
}
