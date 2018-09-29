package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequiredAuth {

    private List<SimpleAccount> accounts;

    private List<Key> keys;

    private String threshold;

    private List<Wait> waits;

}
