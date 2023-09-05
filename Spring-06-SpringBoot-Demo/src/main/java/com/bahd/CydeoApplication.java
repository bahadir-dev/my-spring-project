package com.bahd;

import com.bahd.model.Comment;
import com.bahd.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {

		Comment comment = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring Framework!");

		ApplicationContext context = SpringApplication.run(CydeoApplication.class, args);
		CommentService cs = context.getBean(CommentService.class);
		cs.publishComment(comment);
	}

}
