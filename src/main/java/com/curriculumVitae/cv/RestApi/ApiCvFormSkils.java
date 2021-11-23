package com.curriculumVitae.cv.RestApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculumVitae.cv.Entities.CvFormSkils;
import com.curriculumVitae.cv.IManager.IManagerCvFormSkils;

@RestController
@RequestMapping("/api/cvSkils")
@CrossOrigin
public class ApiCvFormSkils {
	private IManagerCvFormSkils iManagerCvFormSkils;

	@Autowired
	public ApiCvFormSkils(IManagerCvFormSkils iManagerCvFormSkils) {
		this.iManagerCvFormSkils = iManagerCvFormSkils;
	}

	@GetMapping("/cvList")
	public List<CvFormSkils> list() {
		return this.iManagerCvFormSkils.getAll();
	}

	@PostMapping("/cvSave")
	public void save(@RequestBody CvFormSkils cvFormSkils) {
		this.iManagerCvFormSkils.add(cvFormSkils);
	}

	@PostMapping("/cvUpdate")
	public void update(@RequestBody CvFormSkils cvFormLinks) {
		this.iManagerCvFormSkils.add(cvFormLinks);
	}

	@DeleteMapping("/cvDelete")
	public void delete(@RequestBody CvFormSkils cvFormLinks) {
		this.iManagerCvFormSkils.delete(cvFormLinks);
	}

	@GetMapping("/cvGet/{id}")
	public Optional<CvFormSkils> getById(@PathVariable int id) {
		return this.iManagerCvFormSkils.getById(id);
	}
}
