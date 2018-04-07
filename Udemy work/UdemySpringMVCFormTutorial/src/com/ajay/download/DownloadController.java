package com.ajay.download;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/download")
public class DownloadController {

	@RequestMapping("/filedownload")
	public void downloadFiles(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String filepath="C:\\Users\\Ajay_Kushwaha\\Desktop\\"; String filename="fileletter.pdf";
		File file=new File(filepath+filename);
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment;filename=" + file.getName());
		BufferedInputStream inStrem = new BufferedInputStream(new FileInputStream(file));
	    BufferedOutputStream outStream = new BufferedOutputStream(response.getOutputStream());
	    byte[] buffer = new byte[1024];
	      int bytesRead = 0;
	      while ((bytesRead = inStrem.read(buffer)) != -1) {
	        outStream.write(buffer, 0, bytesRead);
	      }
	      outStream.flush();
	      inStrem.close();
	}
	
	// Using ResponseEntity<InputStreamResource>
	   @RequestMapping("/filedownload1")
	   public ResponseEntity<InputStreamResource> downloadFile1() throws IOException {
		  String filepath="C:\\Users\\Ajay_Kushwaha\\Desktop\\"; String filename="fileletter.pdf";
	      File file = new File(filepath+filename);
	      InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
	      return ResponseEntity.ok()
	            .header(HttpHeaders.CONTENT_DISPOSITION,
	                  "attachment;filename=" + file.getName())
	            .contentType(MediaType.APPLICATION_PDF).contentLength(file.length())
	            .body(resource);
	   }
	// Using ResponseEntity<ByteArrayResource>
	   @RequestMapping("/filedownload2")
	   public ResponseEntity<ByteArrayResource> downloadFile2() throws IOException {
          String filepath="C:\\Users\\Ajay_Kushwaha\\Desktop\\"; String filename="fileletter.pdf";
	      Path path = Paths.get(filepath+filename);
	      byte[] data = Files.readAllBytes(path);
	      ByteArrayResource resource = new ByteArrayResource(data);
	      return ResponseEntity.ok()
	            .header(HttpHeaders.CONTENT_DISPOSITION,
	                  "attachment;filename=" + path.getFileName().toString())
	            .contentType(MediaType.APPLICATION_PDF).contentLength(data.length)
	            .body(resource);
	   }


}
