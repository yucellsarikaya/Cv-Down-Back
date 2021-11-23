package com.curriculumVitae.cv.IDataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculumVitae.cv.Entities.CvForm;

public interface IDataCvForm extends JpaRepository<CvForm, Integer> {

}
