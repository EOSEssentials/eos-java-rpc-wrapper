package client.domain.common;

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
public class Receipt {

    @JsonProperty("abi_sequence")
    private Integer abiSequence;

    @JsonProperty("act_digest")
    private String actDigest;

    @JsonProperty("auth_sequence")
    private List<List<String>> authSequence = null;

    @JsonProperty("code_sequence")
    private Integer codeSequence;

    @JsonProperty("global_sequence")
    private Integer globalSequence;

    private String receiver;

    @JsonProperty("recv_sequence")
    private Integer recvSequence;

}
