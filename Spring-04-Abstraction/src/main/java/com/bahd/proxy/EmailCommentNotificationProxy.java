package com.bahd.proxy;

import com.bahd.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Notification for comment: " +comment.getText());
    }
}
