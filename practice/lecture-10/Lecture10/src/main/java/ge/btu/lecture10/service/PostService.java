package ge.btu.lecture10.service;

import ge.btu.lecture10.DTO.post.*;

public interface PostService {
    GetPostsOutput getPosts(GetPostsInput getPostsInput);

    AddPostOutput addPost(AddPostInput addPostInput);

    GetPostDetailsOutput getPostDetails(GetPostDetailInput getPostDetailInput);

    void deletePost(Long id);
}
