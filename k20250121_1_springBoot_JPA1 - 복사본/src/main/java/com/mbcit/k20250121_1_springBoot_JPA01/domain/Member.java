package com.mbcit.k20250121_1_springBoot_JPA01.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 멤버를 초기화 하는 생성자
@RequiredArgsConstructor // @NonNull 어노테이션을 붙여준 멤버만 초기화 하는 생성자
//	@Getter // 모든 멤버의 getter 메소드
//	@Setter // 모든 멤버의 setter 메소드
//	@ToString // toString() 메소드
//	@EqualsAndHashCode // equals(), hashCode() 메소드
@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode 어노테이션을 모두 실행한다.
@Builder // 생성자를 대신해서 객체를 생성할 수 있다.

//	클래스에 @Entity 어노테이션을 붙여주면 JPA가 자동으로 테이블을 만들어준다.
@Entity

//	@SequenceGenerator 어노테이션으로 시퀀스를 만들어 사용할 수 있다.
@SequenceGenerator(
	name = "seq_generator", // 시퀀스 제네레이터 이름 @GeneratedValue의 generator 속성 값으로 지정한다.
	sequenceName = "member_id_seq", // 테이블에 매핑할 시퀀스 이름
	initialValue = 1, // 시퀀스 초기값
	allocationSize = 1 // 시퀀스 증가값
)

//	@Table 어노테이션으로 테이블 이름 변경, 인덱스 생성, 유일성 제약을 지정할 수 있다.
@Table(
	name = "member2", // 변경할 테이블 이름
	indexes = {@Index(columnList = "name")}, // 인덱스 생성
	uniqueConstraints = {@UniqueConstraint(columnNames = "email")} // 유일성 제약
)
public class Member {

//	필드에 @Id 어노테이션을 붙여주면 기본키 필드로 선언한다.
	@Id
//	@GeneratedValue 어노테이션으로 기본키 필드 값을 자동으로 증가시키는 방법을 지정한다.
//	GenerationType.IDENTITY는 AUTO_INCREMENT를 사용해서 자동으로 1씩 증가하는 값이 입력된다.
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	GenerationType.SEQUENCE는 SEQUENCE를 사용해서 자동으로 1씩 증가하는 값이 입력된다.
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator")
//	GenerationType.TABLE는 키 생성 전용 테이블을 생성해서 데이터베이스 시퀀스 처럼 사용한다.
//	@GeneratedValue(strategy = GenerationType.TABLE)
//	GenerationType.AUTO는 데이터베이스에 따라 위 3가지 방법 중에서 자동으로 하나를 선택해서 사용한다.
//	@GeneratedValue(strategy = GenerationType.AUTO) // 기본값
//	@GeneratedValue
	private Long id;
	
//	@Transient 어노테이션은 데이터베이스에는 반영하지 않고 사용하려는 멤버에 붙여준다.
	@Transient
	private String testData;
	
	@NonNull // null 값을 허용하지 않는다.
	private String name;
	@NonNull
	private String email;
	
//	@Column 어노테이션은 테이블을 구성하는 필드에 별도의 설정을 하기 위해 붙인다. 붙이지 않아도 상관없다.
//	@Column 어노테이션은 필드 이름 변경, null 값 허용 여부, 유일성 제약 사항, 필드 길이 지정 작업을 할 수 있다.
	@Column(
		name = "nick", // 변경할 필드 이름
		nullable = false, // null 값 허용 여부
		unique = true, // 유일성 제약 사항
		length = 2000 // 필드 길이 지정
	)
	private String nickname;
	
//	updatable 속성 값을 false로 지정하면 update sql 명령 실행시 해당 필드를 반영하지 않는다.
	@Column(updatable = false)
	private LocalDateTime createDate;
//	insertable 속성 값을 false로 지정하면 insert sql 명령 실행시 해당 필드를 반영하지 않는다.
	@Column(insertable = false)
	private LocalDateTime updateDate;
	
//	enum 객체를 사용할 때 @Enumerated 어노테이션 value 속성 값이 기본 값인 EnumType.ORDINAL로 되어있기
//	때문에 enum 객체에서 정의한 순서대로 인덱스가 부여되므로 코딩 과정에서 enum 객체의 순서가 변경되면
//	인덱스도 같이 변경되는 문제가 발생할 수 있다.
//	@Enumerated(value = EnumType.ORDINAL) // 기본값
//	이를 방지하기 위해서 @Enumerated 어노테이션 value 속성 값을 EnumType.STRING으로 변경하면 enum 객체의
//	순서가 변경되더라도 인덱스가 아닌 문자열로 처리되므로 오류가 발생될 가능성이 낮아진다.
	@Enumerated(value = EnumType.STRING)
	private Gender gender;
	
}










