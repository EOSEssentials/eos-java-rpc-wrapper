package client.domain.common.transaction;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionAction {

    private String account;

    private String name;

    private List<TransactionAuthorization> authorization;

    private String data;

}
