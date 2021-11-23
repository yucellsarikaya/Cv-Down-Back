package com.curriculumVitae.cv.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculumVitae.cv.Entities.CvFormSkils;
import com.curriculumVitae.cv.IDataAccess.IDataCvFormSkils;
import com.curriculumVitae.cv.IManager.IManagerCvFormSkils;

@Service
public class BusinessCvFormSkils implements IManagerCvFormSkils {
	private IDataCvFormSkils cvFormSkils;

	@Autowired
	public BusinessCvFormSkils(IDataCvFormSkils cvFormSkils) {
		this.cvFormSkils = cvFormSkils;
	}

	@Override
	public List<CvFormSkils> getAll() {
		return this.cvFormSkils.findAll();
	}

	@Override
	public void add(CvFormSkils cvFormSkils) {
		this.cvFormSkils.save(cvFormSkils);
	}

	@Override
	public void update(CvFormSkils cvFormSkils) {
		this.cvFormSkils.save(cvFormSkils);
	}

	@Override
	public void delete(CvFormSkils cvFormSkils) {
		this.cvFormSkils.delete(cvFormSkils);
	}

	@Override
	public Optional<CvFormSkils> getById(int id) {
		return this.cvFormSkils.findById(id);
	}

}
