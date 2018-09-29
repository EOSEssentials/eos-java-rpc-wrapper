package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChainInfo {

    @JsonProperty("server_version")
    private String serverVersion;

    @JsonProperty("server_version_string")
    private String serverVersionString;

    @JsonProperty("chain_id")
    private String chainId;

    @JsonProperty("head_block_num")
    private String headBlockNum;

    @JsonProperty("last_irreversible_block_num")
    private String lastIrreversibleBlockNum;

    @JsonProperty("last_irreversible_block_id")
    private String lastIrreversibleBlockId;

    @JsonProperty("head_block_id")
    private String headBlockId;

    @JsonProperty("head_block_time")
    private String headBlockTime;

    @JsonProperty("head_block_producer")
    private String headBlockProducer;

    @JsonProperty("virtual_block_cpu_limit")
    private String virtualBlockCpuLimit;

    @JsonProperty("virtual_block_net_limit")
    private String virtualBlockNetLimit;

    @JsonProperty("block_cpu_limit")
    private String blockCpuLimit;

    @JsonProperty("block_net_limit")
    private String blockNetLimit;

}
