package com.cartus.metier;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.cartus.dao.ImageRepository;
import com.cartus.entities.ImageModel;
@Service
public class ImageMetier {
	@Autowired
	private ImageRepository imageRepository;
	
	public boolean saveImage() throws IOException {
		// TODO Auto-generated method stub
		ClassPathResource backImgFile = new ClassPathResource("images/DSC_1142.jpg");
		byte[] arrayPic = new byte[(int) backImgFile.contentLength()];
		backImgFile.getInputStream().read(arrayPic);
		ImageModel image = new ImageModel(1, "DSC_1142", "png", arrayPic);
		imageRepository.save(image);
		return true;
	}
}
