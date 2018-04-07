package com.luv2code.springdemo.filedownload.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/download")
public class FileDownloadController {

	@RequestMapping("/pdf")
	public void downloadPDF(HttpServletRequest request,HttpServletResponse response){
		Path file = Paths.get("C:\\Users\\Ajay_Kushwaha\\Desktop","fileletter.pdf");
		if(Files.exists(file)){
			response.setContentType("application/octet-stream"); //Use this to download any kind of file
            response.addHeader("Content-Disposition", "attachment; filename="+"fileletter.pdf");
            try
            {
                Files.copy(file, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
		}
	}
	
	@RequestMapping("/doc")
	public void downloadDOC(HttpServletRequest request,HttpServletResponse response){
		Path file = Paths.get("C:\\Users\\Ajay_Kushwaha\\Desktop","Resume.docx");
		if(Files.exists(file)){
			response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition", "attachment; filename="+"Resume.docx");
            try
            {
                Files.copy(file, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
		}
	}
	
	@RequestMapping("/image")
	public void downloadImage(HttpServletRequest request,HttpServletResponse response){
		Path file = Paths.get("C:\\Users\\Ajay_Kushwaha\\Desktop","Income-tax e-return.jpg");
		if(Files.exists(file)){
			response.setContentType("application/octet-stream");
            response.addHeader("Content-Disposition", "attachment; filename="+"Income-tax e-return.jpg");
            try
            {
                Files.copy(file, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
		}
	}
	
	@RequestMapping("/links")
	public String getDownloadLinkPage(){
		return "downloadFilePageLink";
	}
	
	
	
}
