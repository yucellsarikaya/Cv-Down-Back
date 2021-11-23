package com.curriculumVitae.cv.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculumVitae.cv.Entities.CvForm;
import com.curriculumVitae.cv.IDataAccess.IDataCvForm;
import com.curriculumVitae.cv.IManager.IManagerCvForm;

@Service
public class BusinessCvForm implements IManagerCvForm {
	private IDataCvForm cvForm;

	@Autowired
	public BusinessCvForm(IDataCvForm cvForm) {
		this.cvForm = cvForm;
	}

	@Override
	public List<CvForm> getAll() {
		return this.cvForm.findAll();
	}

	@Override
	public void add(CvForm cvForm) {
		this.cvForm.save(cvForm);
	}

	@Override
	public void update(CvForm cvForm) {
		this.cvForm.save(cvForm);
	}

	@Override
	public void delete(CvForm cvForm) {
		this.cvForm.delete(cvForm);
	}

	@Override
	public Optional<CvForm> getById(int id) {
		return this.cvForm.findById(id);
	}

}
