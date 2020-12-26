package jpa.domain.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import jpa.domain.BaseEntity;

@Entity
public class Member extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;

	private int age;

	private String email;

	private String password;

	protected Member() {
	}

	public Member(int age, String email, String password) {
		this.age = age;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
