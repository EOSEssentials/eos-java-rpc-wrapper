package client.domain.response.chain.code;

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
public class Table {

    private String name;

    private String type;

    @JsonProperty("index_type")
    private String indexType;

    @JsonProperty("key_names")
    private List<String> keyNames;

    @JsonProperty("key_types")
    private List<String> keyTypes;

}
