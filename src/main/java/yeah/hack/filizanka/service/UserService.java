package yeah.hack.filizanka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yeah.hack.filizanka.model.Skin;
import yeah.hack.filizanka.model.TrainRide;
import yeah.hack.filizanka.model.User;
import yeah.hack.filizanka.repository.SkinRepository;
import yeah.hack.filizanka.repository.TrainRideRepository;
import yeah.hack.filizanka.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final TrainRideRepository trainRideRepository;
    private final SkinRepository skinRepository;

    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    public User updateCurrentTrainRide(Long id, String trainRideId) {
        final User user = userRepository.getOne(id);
        final TrainRide newTrainRide = trainRideRepository.getOne(trainRideId);

        user.setCurrentTrainRide(newTrainRide);

        return userRepository.saveAndFlush(user);
    }

    public User updateActiveSkin(Long id, Long skinId) {
        final User user = userRepository.getOne(id);
        final Skin skin = skinRepository.getOne(skinId);
        user.setActiveSkin(skin);

        return userRepository.saveAndFlush(user);

    }
}
