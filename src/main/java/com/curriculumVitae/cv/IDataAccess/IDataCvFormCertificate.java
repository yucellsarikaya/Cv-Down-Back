package com.curriculumVitae.cv.IDataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculumVitae.cv.Entities.CvFormCertificate;

public interface IDataCvFormCertificate extends JpaRepository<CvFormCertificate, Integer> {

}
