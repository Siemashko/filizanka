package yeah.hack.filizanka.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import yeah.hack.filizanka.model.Train;
import yeah.hack.filizanka.model.TrainRide;
import yeah.hack.filizanka.model.User;
import yeah.hack.filizanka.repository.TrainRepository;
import yeah.hack.filizanka.repository.TrainRideRepository;
import yeah.hack.filizanka.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class MockDataUtil {

    private final UserRepository userRepository;
    private final TrainRideRepository trainRideRepository;
    private final TrainRepository trainRepository;

    @PostConstruct
    public void importData() {

        final Train train = new Train(1L,"Pendolino");

        trainRepository.save(train);

        final TrainRide trainRide = new TrainRide("1", train, Set.of(), 0.0, 0.0);

        trainRideRepository.save(trainRide);
        userRepository.save(User.builder().userId(1L).name("Emil").currentTrainRide(trainRide).credits(0L).build());
        userRepository.save(User.builder().userId(2L).name("Kacper").currentTrainRide(trainRide).credits(0L).build());
        userRepository.save(User.builder().userId(3L).name("Krystian1").currentTrainRide(trainRide).credits(0L).build());
        userRepository.save(User.builder().userId(4L).name("Krystian2").currentTrainRide(trainRide).credits(0L).build());
        userRepository.save(User.builder().userId(5L).name("Paweł").currentTrainRide(trainRide).credits(0L).build());

    }
}
