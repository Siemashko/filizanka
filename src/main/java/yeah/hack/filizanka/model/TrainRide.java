package yeah.hack.filizanka.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrainRide {

    @Id
    private String trainRideId;

    @OneToOne
    private Train train;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "train_ride_station",
            joinColumns = @JoinColumn(name = "train_ride_id"),
            inverseJoinColumns = @JoinColumn(name = "station_id"))
    private Set<Point> points;

    private Double lng;

    private Double lat;
}
