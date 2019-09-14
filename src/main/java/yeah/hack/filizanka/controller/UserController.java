package yeah.hack.filizanka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yeah.hack.filizanka.controller.dto.UserDto;
import yeah.hack.filizanka.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable(value = "id") Long id){
        return UserDto.from(userService.getUserById(id));
    }

    @PutMapping("{id}/train-ride/{train-ride-id}")
    public UserDto updateCurrentTrainRide(@PathVariable(value="id") Long id, @PathVariable(value="train-ride-id") String trainRideId){
        return UserDto.from(userService.updateCurrentTrainRide(id, trainRideId));
    }

    @PutMapping("{id}/skin/{skin-id}")
    public UserDto updateUserActiveSkin(@PathVariable(value="id") Long id, @PathVariable(value="skin-id") Long skinId){
        return UserDto.from(userService.updateActiveSkin(id, skinId));
    }
}
