package com.bahd.proxy;

import com.bahd.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
