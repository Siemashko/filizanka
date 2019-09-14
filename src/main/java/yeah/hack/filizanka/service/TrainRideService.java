package yeah.hack.filizanka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yeah.hack.filizanka.model.TrainRide;
import yeah.hack.filizanka.model.User;
import yeah.hack.filizanka.repository.TrainRideRepository;
import yeah.hack.filizanka.repository.UserRepository;

import java.util.Set;

@Service
@RequiredArgsConstructor
@Transactional
public class TrainRideService {

    private final TrainRideRepository trainRideRepository;

    private final UserRepository userRepository;

    public TrainRide getTrainRideById(String id) {
        return trainRideRepository.getOne(id);
    }

    public Set<User> getTrainRidePassengersById(String id) {

        final TrainRide currentTrainRide = trainRideRepository.getOne(id);

        return userRepository.findAllByCurrentTrainRide(currentTrainRide);

    }

}
