
package client.domain.response.history.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    private Header header;

    public Header getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(Header header) {
        this.header = header;
    }

}
