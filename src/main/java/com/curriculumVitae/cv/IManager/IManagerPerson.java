package com.curriculumVitae.cv.IManager;

import java.util.Optional;

import com.curriculumVitae.cv.Entities.MemberTransactions;

public interface IManagerPerson {
	void save(MemberTransactions person);

	void update(MemberTransactions person);

	Optional<MemberTransactions> getById(String id);
}
