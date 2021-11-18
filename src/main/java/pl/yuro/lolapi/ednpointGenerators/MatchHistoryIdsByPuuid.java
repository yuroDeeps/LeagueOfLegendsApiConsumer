package pl.yuro.lolapi.ednpointGenerators;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import pl.yuro.lolapi.entities.Regions;

import java.util.HashMap;

@NoArgsConstructor
@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "lol.api")
public class MatchHistoryIdsByPuuid {

    private String apiKey;
    private HashMap<String, Integer> queueType = new HashMap<>();

    public String generateEndpoint(Regions region, String type, String puuid, int count) {
        queueType.put("solo",420);
        queueType.put("premade",6);
        return "https://"+region.name()+".api.riotgames.com/lol/match/v5/matches/by-puuid/"+puuid+"/ids?queue="+queueType
                .get(type)+"&start=0&count="+count+"&api_key="+apiKey;
    }

    public String generateEndpoint(Regions region, String puuid, int count) {
        queueType.put("solo",420);
        queueType.put("premade",6);
        return "https://"+region.name()+".api.riotgames.com/lol/match/v5/matches/by-puuid/"+puuid+"/ids?start=0&count="+count+"&api_key="+apiKey;
    }
}
