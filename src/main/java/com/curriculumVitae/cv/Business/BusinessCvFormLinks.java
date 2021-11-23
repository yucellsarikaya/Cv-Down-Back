package com.curriculumVitae.cv.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculumVitae.cv.Entities.CvFormLinks;
import com.curriculumVitae.cv.IDataAccess.IDataCvFormLinks;
import com.curriculumVitae.cv.IManager.IManagerCvFormLinks;

@Service
public class BusinessCvFormLinks implements IManagerCvFormLinks {
	private IDataCvFormLinks cvFormLinks;

	@Autowired
	public BusinessCvFormLinks(IDataCvFormLinks cvFormLinks) {
		this.cvFormLinks = cvFormLinks;
	}

	@Override
	public List<CvFormLinks> getAll() {
		return this.cvFormLinks.findAll();
	}

	@Override
	public void add(CvFormLinks cvFormLinks) {
		this.cvFormLinks.save(cvFormLinks);
	}

	@Override
	public void update(CvFormLinks cvFormLinks) {
		this.cvFormLinks.save(cvFormLinks);
	}

	@Override
	public void delete(CvFormLinks cvFormLinks) {
		this.cvFormLinks.delete(cvFormLinks);
	}

	@Override
	public Optional<CvFormLinks> getById(int id) {
		return this.cvFormLinks.findById(id);
	}

}
