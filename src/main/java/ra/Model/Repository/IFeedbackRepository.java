package ra.Model.Repository;

import ra.Model.Entity.Feedback;

import java.util.List;

public interface IFeedbackRepository {
    List<Feedback> findAll();
    Feedback findById(Long id);
    void save(Feedback feedback);
    void delete(Long id);
}
