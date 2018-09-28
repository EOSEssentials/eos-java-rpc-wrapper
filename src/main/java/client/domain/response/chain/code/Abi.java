package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Abi {

    private String version;

    private List<Type> types;

    private List<Struct> structs;

    private List<Action> actions;

    private List<Table> tables;

    @JsonProperty("ricardian_clauses")
    private List<String> ricardianClauses;

    @JsonProperty("error_messages")
    private List<ErrorMessage> errorMessages;

    // TODO: this might be of some particular type, but I couldn't find any examples of how this would look like
    @JsonProperty("abi_extensions")
    private Object abiExtensions;

}
