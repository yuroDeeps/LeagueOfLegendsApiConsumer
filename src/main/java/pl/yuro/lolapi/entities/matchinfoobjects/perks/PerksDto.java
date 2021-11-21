package pl.yuro.lolapi.entities.matchinfoobjects.perks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PerksDto {
    private PerkStatsDto statPerks;
    private ArrayList<PerkStyleDto> styles;
}
