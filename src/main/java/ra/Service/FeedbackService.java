package ra.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.Model.DTO.FeedbackDto;
import ra.Model.Entity.Feedback;
import ra.Model.Repository.IFeedbackRepository;

import java.util.List;

@Service
public class FeedbackService implements IFeedbackService {
    @Autowired
    private IFeedbackRepository feedbackRepository;

    @Override
    public List<Feedback> findAll() {
        return feedbackRepository.findAll();
    }

    @Override
    public Feedback findById(Long id) {
        return feedbackRepository.findById(id);
    }


    @Override
    public void save(FeedbackDto feedbackDto) {
        Feedback feedback = new Feedback(feedbackDto.getId(),
                feedbackDto.getRate(), feedbackDto.getAuthor(),
                feedbackDto.getContent(), feedbackDto.getCreationDate(), feedbackDto.getLike());
        feedbackRepository.save(feedback);
    }

    @Override
    public void delete(Long id) {
        feedbackRepository.delete(id);
    }

    @Override
    public void like(Long id) {
        Feedback feedback = feedbackRepository.findById(id);
        feedback.setLikes(feedback.getLikes() + 1);
        feedbackRepository.save(feedback);
    }
}
