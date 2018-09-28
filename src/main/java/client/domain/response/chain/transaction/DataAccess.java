package client.domain.response.chain.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataAccess {

    private String scope;

    private String sequence;

    private String code;

    private String type;

}
