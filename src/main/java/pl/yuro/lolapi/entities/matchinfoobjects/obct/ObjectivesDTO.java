package pl.yuro.lolapi.entities.matchinfoobjects.obct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectivesDTO {

    private ObjectiveDTO baron;
    private ObjectiveDTO champion;
    private ObjectiveDTO dragon;
    private  ObjectiveDTO inhibitor;
    private ObjectiveDTO riftHerald;
    private ObjectiveDTO tower;
}
