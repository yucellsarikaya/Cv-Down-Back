package com.curriculumVitae.cv.IDataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculumVitae.cv.Entities.CvFormLinks;

public interface IDataCvFormLinks extends JpaRepository<CvFormLinks, Integer> {

}
