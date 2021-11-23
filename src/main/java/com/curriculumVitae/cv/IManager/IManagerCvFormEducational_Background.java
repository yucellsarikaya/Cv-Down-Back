package com.curriculumVitae.cv.IManager;

import java.util.List;
import java.util.Optional;

import com.curriculumVitae.cv.Entities.CvFormEducational_Background;

public interface IManagerCvFormEducational_Background {
	List<CvFormEducational_Background> getAll();

	void add(CvFormEducational_Background educational_Background);

	void update(CvFormEducational_Background educational_Background);

	void delete(CvFormEducational_Background educational_Background);
	
	Optional<CvFormEducational_Background> getById(int id);
}
