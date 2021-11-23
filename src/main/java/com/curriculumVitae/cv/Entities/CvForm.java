package com.curriculumVitae.cv.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "cvform")
public class CvForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "person_id")
	private String person_id;

	@Column(name = "name_surname")
	private String name_surname;

	@Column(name = "job")
	private String job;

	@Column(name = "phone")
	private String phone;

	@Column(name = "mail")
	private String mail;

	@Column(name = "location")
	private String location;

	@Column(name = "cover_letter")
	private String cover_letter;

	@Column(name = "driving_license")
	private String driving_license;

}
