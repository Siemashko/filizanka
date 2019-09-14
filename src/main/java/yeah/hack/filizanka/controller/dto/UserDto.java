package yeah.hack.filizanka.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import yeah.hack.filizanka.model.Carriage;
import yeah.hack.filizanka.model.Egg;
import yeah.hack.filizanka.model.Skin;
import yeah.hack.filizanka.model.User;

import java.util.Set;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long userId;

    private String name;

    private Long activeSkinId;

    private Long credits;

    private Set<Long> skinIds;

    private Set<Long> carriageIds;

    private Set<Long> eggIds;

    private String currentTrainRide;

    public static UserDto from(User source) {

        return UserDto.builder()
                .userId(source.getUserId())
                .name(source.getName())
                .activeSkinId(source.getActiveSkin() == null ? 0 : source.getActiveSkin().getSkinId())
                .credits(source.getCredits())
                .skinIds(source.getSkins().stream().map(Skin::getSkinId).collect(Collectors.toSet()))
                .carriageIds(source.getCarriages().stream().map(Carriage::getCarriageId).collect(Collectors.toSet()))
                .eggIds(source.getEggs().stream().map(Egg::getEggId).collect(Collectors.toSet()))
                .currentTrainRide(source.getCurrentTrainRide().getTrainRideId())
                .build();

    }

}
