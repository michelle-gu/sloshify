package com.sloshify.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class SongValidator implements Validator{

	@Override
	public boolean supports(Class clazz) {
		//just validate the Song instances
		return Song.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Song name",
			"name is required!", "Field name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Song duration",
				"duration is required!", "Field name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Song BPM",
				"BPM is required!", "Field name is required.");

	}

}
