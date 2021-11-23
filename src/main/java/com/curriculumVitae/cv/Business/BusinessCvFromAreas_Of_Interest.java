package com.curriculumVitae.cv.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculumVitae.cv.Entities.CvFormAreas_Of_Interest;
import com.curriculumVitae.cv.IDataAccess.IDataCvFormAreas_Of_Interest;
import com.curriculumVitae.cv.IManager.IManagerCvFormAreas_Of_Interest;

@Service
public class BusinessCvFromAreas_Of_Interest implements IManagerCvFormAreas_Of_Interest {
	private IDataCvFormAreas_Of_Interest areas_Of_Interest;

	@Autowired
	public BusinessCvFromAreas_Of_Interest(IDataCvFormAreas_Of_Interest areas_Of_Interest) {
		this.areas_Of_Interest = areas_Of_Interest;
	}

	@Override
	public List<CvFormAreas_Of_Interest> getAll() {
		return this.areas_Of_Interest.findAll();
	}

	@Override
	public void add(CvFormAreas_Of_Interest areas_Of_Interest) {
		this.areas_Of_Interest.save(areas_Of_Interest);
	}

	@Override
	public void update(CvFormAreas_Of_Interest areas_Of_Interest) {
		this.areas_Of_Interest.save(areas_Of_Interest);
	}

	@Override
	public void delete(CvFormAreas_Of_Interest areas_Of_Interest) {
		this.areas_Of_Interest.delete(areas_Of_Interest);
	}

	@Override
	public Optional<CvFormAreas_Of_Interest> getById(int id) {
		return this.areas_Of_Interest.findById(id);
	}

}
