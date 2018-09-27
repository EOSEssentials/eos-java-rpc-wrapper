package client.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public interface ErrorCode {
    int getNumber();
}
