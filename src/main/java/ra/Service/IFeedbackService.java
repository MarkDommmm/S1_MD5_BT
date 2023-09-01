package ra.Service;

import ra.Model.DTO.FeedbackDto;
import ra.Model.Entity.Feedback;

import java.util.List;

public interface IFeedbackService {
    List<Feedback> findAll();
    Feedback findById(Long id);
    void save(FeedbackDto feedbackDto);
    void delete(Long id);
    void like(Long id);
}
