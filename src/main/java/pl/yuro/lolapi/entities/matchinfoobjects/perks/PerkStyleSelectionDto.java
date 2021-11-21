package pl.yuro.lolapi.entities.matchinfoobjects.perks;

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
public class PerkStyleSelectionDto {
    private int perk;
    private int var1;
    private int var2;
    private int var3;
}
