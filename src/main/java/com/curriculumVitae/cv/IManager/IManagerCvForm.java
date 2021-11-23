package com.curriculumVitae.cv.IManager;

import java.util.List;
import java.util.Optional;

import com.curriculumVitae.cv.Entities.CvForm;

public interface IManagerCvForm {
	List<CvForm> getAll();

	void add(CvForm cvForm);

	void update(CvForm cvForm);

	void delete(CvForm cvForm);

	Optional<CvForm> getById(int id);

}
