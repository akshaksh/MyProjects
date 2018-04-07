package com.ajay.form.upload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@RequestMapping("/loading")
public class UploadController {

	//Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "F://Movies//";

    @RequestMapping("/uploadFile")
    public String uploadFile(){
    	return "FileUpload";
    }
    @RequestMapping("/uploadStatus")
    public String uploadStatus(){
    	return "uploadStatus";
    }
    @RequestMapping("/uploadSingle")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,RedirectAttributes redirectAttributes){
    	if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:/loading/uploadStatus";
        }
    	try {

            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                        "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }
    	return "redirect:/loading/uploadStatus";
    }
    @RequestMapping("/uploadMultiple")
    public String uploadMultiple(@RequestParam("files") MultipartFile[] files,RedirectAttributes redirectAttributes){
    	if (files.length == 0) {
            redirectAttributes.addFlashAttribute("message", "Please select atleast one file to upload");
            return "redirect:uploadStatus";
        }
    	else {
		for(MultipartFile file:files){	
	    	try {
	
	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	            Files.write(path, bytes);
	            redirectAttributes.addFlashAttribute("message",
	                        "You successfully uploaded '" + file.getOriginalFilename() + "'");
	
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
    	}
    	return "redirect:/loading/uploadStatus";
    }
	
}
