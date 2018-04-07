package annotations;
// To get our  Annotation on java-doc we need to use @Document on top of our Annotation
public @interface MyAnnote {
	   String author() default "Ajay";
	   String date();
	   int currentRevision() default 1;
	   String lastModified() default "N/A";
	   String lastModifiedBy() default "N/A";
	   // Note use of array
	   String[] reviewers();
}
