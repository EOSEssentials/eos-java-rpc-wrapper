package client.domain.request.wallet.transaction;


import client.domain.common.transaction.PackedTransaction;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SignTransactionRequest {

    private PackedTransaction packedTransaction;

    private List<String> publicKeys;

    private String chainId;

}
