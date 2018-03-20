package com.cartus.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartus.metier.ImageMetier;

@RestController
public class ImageController {
	@Autowired
	private ImageMetier imageMetier;
	

	@RequestMapping(value = "/image", method = RequestMethod.POST)
	public boolean saveImage() throws IOException {
		return imageMetier.saveImage();
	}
}
