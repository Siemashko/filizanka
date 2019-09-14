package yeah.hack.filizanka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yeah.hack.filizanka.repository.TrainRideRepository;
import yeah.hack.filizanka.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class CreditService {

    private final UserRepository userRepository;

}
