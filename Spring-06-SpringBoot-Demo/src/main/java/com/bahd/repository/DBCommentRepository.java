package com.bahd.repository;

import com.bahd.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment stored in database: " + comment.getText());
    }
}
