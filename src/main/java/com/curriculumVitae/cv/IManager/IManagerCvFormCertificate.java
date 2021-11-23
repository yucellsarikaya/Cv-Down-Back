package com.curriculumVitae.cv.IManager;

import java.util.List;
import java.util.Optional;

import com.curriculumVitae.cv.Entities.CvFormCertificate;

public interface IManagerCvFormCertificate {
	List<CvFormCertificate> getAll();

	void add(CvFormCertificate certificate);

	void update(CvFormCertificate certificate);

	void delete(CvFormCertificate certificate);
	
	Optional<CvFormCertificate> getById(int id);
}
