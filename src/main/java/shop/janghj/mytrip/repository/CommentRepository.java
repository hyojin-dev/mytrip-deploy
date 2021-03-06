package shop.janghj.mytrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.janghj.mytrip.domain.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByUserReviewId(Long reviewId);
}
