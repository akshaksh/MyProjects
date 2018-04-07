package com.luv2code.springdemo.fileupload.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/uploadDownload")
public class FileUploadController {

	@RequestMapping("/uploadfilepage")
	public String getUploadPage(){
		return "uploadfilepage";
	}
	
	@RequestMapping(value="/upload",method = {RequestMethod.GET, RequestMethod.POST})
	public String getUploadedFileInfo(@RequestParam("file") MultipartFile[] files,RedirectAttributes redirectAttributes){
		try{
			StringJoiner joiner=new StringJoiner(",");
					for(MultipartFile file:files){
					if(!file.isEmpty()){
						byte bytes[]=file.getBytes();
						Path path = Paths.get("F:\\Temp\\" + file.getOriginalFilename());
						System.out.println("Path Exist :"+Files.exists(path));
						if(Files.exists(path))
							Files.delete(path);
						Files.write(path, bytes);
						joiner.add(file.getOriginalFilename());
					}
				}
			
			if(joiner.length() != 0){
					redirectAttributes.addFlashAttribute("message","You successfully uploaded '" + joiner + "'");		
				}
			else{
				redirectAttributes.addFlashAttribute("message", "Please select atleast a file to upload");
				return "redirect:uploadfilepage";
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "redirect:uploadedfilepage";
	}
	
	@RequestMapping("/uploadedfilepage")
	public String getUploadedFilePage(){
		System.out.println("Hello come here");
		return "uploadedfilepage";
	}
	
}
