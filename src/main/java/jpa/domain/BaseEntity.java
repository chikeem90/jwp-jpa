package jpa.domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	@Id
	@GeneratedValue
	private Long id;

	@CreatedDate
	private LocalDateTime create_date;

	@LastModifiedDate
	private LocalDateTime modified_date;

	public Long getId() {
		return id;
	}

	public LocalDateTime getCreate_date() {
		return create_date;
	}

	public LocalDateTime getModified_date() {
		return modified_date;
	}
}
