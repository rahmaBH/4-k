package com.example.demo.controller;


import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.example.demo.services.ExcelFileServices;
import com.example.demo.utils.ExcelUtils;

@RestController
public class UploadFileRestAPIs {
	@Autowired
	ExcelFileServices fileServices;
	
	@PostMapping("uploadfiles")
	public Message uploadFileMulti(
	        @RequestParam("uploadfiles") MultipartFile[] uploadfiles) {

        // Get file name
        String uploadedFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
                .filter(x -> !StringUtils.isEmpty(x)).collect(Collectors.joining(" , "));

        if (StringUtils.isEmpty(uploadedFileName)) {
            return new Message(uploadedFileName, "please select a file!", "fail");
        }
        
        String notExcelFiles = Arrays.stream(uploadfiles).filter(x -> !ExcelUtils.isExcelFile(x))
        							.map(x -> x.getOriginalFilename())
        							.collect(Collectors.joining(" , "));
        
		
        
        try {
        	
        	for(MultipartFile file: uploadfiles) {
        		fileServices.store(file);
        	}
            return new Message(uploadedFileName, "Upload Successfully", "ok");

        } catch (Exception e) {
        	Object ok;
		
        	 return new Message(uploadedFileName, "Upload Successfully!", "ok");
        }
    }
}
