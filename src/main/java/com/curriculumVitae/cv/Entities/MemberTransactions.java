package com.curriculumVitae.cv.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "person")
public class MemberTransactions {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "person_id")
	private String id;

	@Column(name = "person_name")
	private String name;

	@Column(name = "person_surname")
	private String surname;

	@Column(name = "person_mail")
	private String mail;

	@Column(name = "person_pass")
	private String pass;

}
