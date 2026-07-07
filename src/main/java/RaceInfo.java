import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RaceInfo {

    @Id
    @GeneratedValue
    private String TrackName;
    private String Country;
    private String City;
    private String Description;
    private Integer TrackNum;
    private String WinningDriver;
    private String WinningTeam;




}
