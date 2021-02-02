package com.zanzibeer.site.repo;

import com.zanzibeer.site.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
