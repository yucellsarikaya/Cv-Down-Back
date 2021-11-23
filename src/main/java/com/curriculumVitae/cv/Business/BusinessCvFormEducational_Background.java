package com.curriculumVitae.cv.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculumVitae.cv.Entities.CvFormEducational_Background;
import com.curriculumVitae.cv.IDataAccess.IDataCvFormEducational_Background;
import com.curriculumVitae.cv.IManager.IManagerCvFormEducational_Background;

@Service
public class BusinessCvFormEducational_Background implements IManagerCvFormEducational_Background {
	private IDataCvFormEducational_Background educational_Background;

	@Autowired
	public BusinessCvFormEducational_Background(IDataCvFormEducational_Background educational_Background) {
		this.educational_Background = educational_Background;
	}

	@Override
	public List<CvFormEducational_Background> getAll() {
		return this.educational_Background.findAll();
	}

	@Override
	public void add(CvFormEducational_Background educational_Background) {
		this.educational_Background.save(educational_Background);
	}

	@Override
	public void update(CvFormEducational_Background educational_Background) {
		this.educational_Background.save(educational_Background);
	}

	@Override
	public void delete(CvFormEducational_Background educational_Background) {
		this.educational_Background.delete(educational_Background);
	}

	@Override
	public Optional<CvFormEducational_Background> getById(int id) {
		return this.educational_Background.findById(id);
	}

}
