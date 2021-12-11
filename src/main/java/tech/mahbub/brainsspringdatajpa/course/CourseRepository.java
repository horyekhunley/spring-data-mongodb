package tech.mahbub.brainsspringdatajpa.course;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
}
