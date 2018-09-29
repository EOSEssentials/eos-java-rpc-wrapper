package client.domain.request.chain.transaction;

import client.domain.common.transaction.PackedTransaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PushTransactionRequest {

    private String compression;

    private PackedTransaction transaction;

    private List<String> signatures;

}
