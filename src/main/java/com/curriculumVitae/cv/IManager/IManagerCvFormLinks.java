package com.curriculumVitae.cv.IManager;

import java.util.List;
import java.util.Optional;

import com.curriculumVitae.cv.Entities.CvFormLinks;

public interface IManagerCvFormLinks {
	List<CvFormLinks> getAll();

	void add(CvFormLinks cvFormLinks);

	void update(CvFormLinks cvFormLinks);

	void delete(CvFormLinks cvFormLinks);
	
	Optional<CvFormLinks> getById(int id);
}
