package yeah.hack.filizanka.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import yeah.hack.filizanka.model.Point;
import yeah.hack.filizanka.model.TrainRide;

import java.util.Set;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainRideDto {

    private String trainRideId;

    private Set<Long> stations;

    private Double lng;

    private Double lat;

    public static TrainRideDto from(TrainRide source) {
        return TrainRideDto.builder()
                .trainRideId(source.getTrainRideId())
                .stations(source.getPoints().stream().map(Point::getStationId).collect(Collectors.toSet()))
                .lng(source.getLng())
                .lat(source.getLat())
                .build();
    }

}
