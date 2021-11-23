package com.curriculumVitae.cv.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculumVitae.cv.Entities.CvFormCertificate;
import com.curriculumVitae.cv.IDataAccess.IDataCvFormCertificate;
import com.curriculumVitae.cv.IManager.IManagerCvFormCertificate;

@Service
public class BusinessCvFormCertificate implements IManagerCvFormCertificate {
	private IDataCvFormCertificate certificate;

	@Autowired
	public BusinessCvFormCertificate(IDataCvFormCertificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public List<CvFormCertificate> getAll() {
		return this.certificate.findAll();
	}

	@Override
	public void add(CvFormCertificate certificate) {
		this.certificate.save(certificate);
	}

	@Override
	public void update(CvFormCertificate certificate) {
		this.certificate.save(certificate);
	}

	@Override
	public void delete(CvFormCertificate certificate) {
		this.certificate.delete(certificate);
	}

	@Override
	public Optional<CvFormCertificate> getById(int id) {
		return this.certificate.findById(id);
	}

}
