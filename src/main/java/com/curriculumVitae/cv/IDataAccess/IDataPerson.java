package com.curriculumVitae.cv.IDataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculumVitae.cv.Entities.MemberTransactions;

public interface IDataPerson extends JpaRepository<MemberTransactions, String> {
	List<MemberTransactions> findByMailAndPass(String mail, String pass);

}
