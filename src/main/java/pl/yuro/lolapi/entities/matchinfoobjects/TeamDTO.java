package pl.yuro.lolapi.entities.matchinfoobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.yuro.lolapi.entities.matchinfoobjects.obct.ObjectivesDTO;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDTO {

    private List<BanDTO> bans;
    private ObjectivesDTO objectives;
    private int teamId;
    private boolean win;
}
