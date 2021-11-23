package com.curriculumVitae.cv.IManager;

import java.util.List;
import java.util.Optional;

import com.curriculumVitae.cv.Entities.CvFormSkils;

public interface IManagerCvFormSkils {
	List<CvFormSkils> getAll();

	void add(CvFormSkils cvFormSkils);

	void update(CvFormSkils cvFormSkils);

	void delete(CvFormSkils cvFormSkils);
	
	Optional<CvFormSkils> getById(int id);
}
