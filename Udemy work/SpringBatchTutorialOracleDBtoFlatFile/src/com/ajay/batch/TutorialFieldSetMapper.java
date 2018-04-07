package com.ajay.batch;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.batch.item.file.mapping.FieldSetMapper; 
import org.springframework.batch.item.file.transform.FieldSet; 
import org.springframework.jdbc.core.RowMapper;
import org.springframework.validation.BindException;  

public class TutorialFieldSetMapper implements RowMapper<Tutorial> {  
	   
	   @Override 
	   public Tutorial mapRow(ResultSet rs, int rowNum) throws SQLException {  
	      
	      Tutorial tutorial = new Tutorial();  
	      tutorial.setTutorial_id(rs.getInt("tutorial_id")); 
	      tutorial.setTutorial_author(rs.getString("tutorial_author")); 
	      tutorial.setTutorial_title(rs.getString("tutorial_title")); 
	      tutorial.setSubmission_date(rs.getString("submission_date"));  
	      return tutorial; 
	   } 
	}