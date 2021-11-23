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

import com.curriculumVitae.cv.Entities.CvFormLinks;
import com.curriculumVitae.cv.IManager.IManagerCvFormLinks;

@RestController
@RequestMapping("/api/cvLink")
@CrossOrigin
public class ApiCvFormLinks {
	private IManagerCvFormLinks cvFormLinks;

	@Autowired
	public ApiCvFormLinks(IManagerCvFormLinks cvFormLinks) {
		this.cvFormLinks = cvFormLinks;
	}

	@GetMapping("/cvList")
	public List<CvFormLinks> list() {
		return this.cvFormLinks.getAll();
	}

	@PostMapping("/cvSave")
	public void save(@RequestBody CvFormLinks cvFormLinks) {
		this.cvFormLinks.add(cvFormLinks);
	}

	@PostMapping("/cvUpdate")
	public void update(@RequestBody CvFormLinks cvFormLinks) {
		this.cvFormLinks.add(cvFormLinks);
	}

	@DeleteMapping("/cvDelete")
	public void delete(@RequestBody CvFormLinks cvFormLinks) {
		this.cvFormLinks.delete(cvFormLinks);
	}

	@GetMapping("/cvGet/{id}")
	public Optional<CvFormLinks> getById(@PathVariable int id) {
		return this.cvFormLinks.getById(id);
	}

}
