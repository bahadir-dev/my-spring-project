package com.bahd.repository;

import com.bahd.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
