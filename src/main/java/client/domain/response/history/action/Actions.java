package client.domain.response.history.action;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Actions {

    private List<Action> actions;

    @JsonProperty("last_irreversible_block")
    private Integer lastIrreversibleBlock;

}
