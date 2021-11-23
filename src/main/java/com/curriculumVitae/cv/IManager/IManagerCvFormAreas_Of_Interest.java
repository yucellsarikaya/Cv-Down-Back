package com.curriculumVitae.cv.IManager;

import java.util.List;
import java.util.Optional;

import com.curriculumVitae.cv.Entities.CvFormAreas_Of_Interest;

public interface IManagerCvFormAreas_Of_Interest {
	List<CvFormAreas_Of_Interest> getAll();

	void add(CvFormAreas_Of_Interest areas_Of_Interest);

	void update(CvFormAreas_Of_Interest areas_Of_Interest);

	void delete(CvFormAreas_Of_Interest areas_Of_Interest);
	
	Optional<CvFormAreas_Of_Interest> getById(int id);
}
