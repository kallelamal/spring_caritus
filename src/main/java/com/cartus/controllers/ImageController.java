package com.cartus.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class ImageController {
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		System.out.println("helloupload");
	    try {
	        // Get the file and save it somewhere
	        byte[] bytes = file.getBytes();

	        //save file in server - you may need an another scenario
	        Path path = Paths.get("/images" + file.getOriginalFilename());
	        Files.write(path, bytes);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    //redirect to an another url end point 
	    return "redirect:/upload-status";
	}
}
