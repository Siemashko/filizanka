package yeah.hack.filizanka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yeah.hack.filizanka.controller.dto.TrainRideDto;
import yeah.hack.filizanka.model.User;
import yeah.hack.filizanka.service.TrainRideService;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/train-ride")
@RequiredArgsConstructor
public class TrainRideController {

    private final TrainRideService trainRideService;

    @GetMapping("/{id}")
    public TrainRideDto getTrainRideInfoById(@PathVariable String id){
        return TrainRideDto.from(trainRideService.getTrainRideById(id));
    }

    @GetMapping("/{id}/users")
    public Set<Long> getTrainRidePassengers(@PathVariable String id){
        return trainRideService.getTrainRidePassengersById(id).stream().map(User::getUserId).collect(Collectors.toSet());
    }
}
