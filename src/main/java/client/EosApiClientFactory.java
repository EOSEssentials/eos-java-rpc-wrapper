package client;

import client.impl.EosApiRestClientImpl;

import java.net.Proxy;

public class EosApiClientFactory {

    /**
     * API Key
     */
    private String apiKey;

    /**
     * Secret.
     */
    private String secret;

    private String baseUrl;

    private Proxy proxy;

    /**
     * Instantiates a new eos api client factory.
     *
     * @param apiKey the API key
     * @param secret the Secret
     */
    private EosApiClientFactory(String apiKey, String secret, String baseUrl, Proxy proxy) {
        this.apiKey = apiKey;
        this.secret = secret;
        this.proxy = proxy;
        this.baseUrl = baseUrl;
    }

    /**
     * New instance.
     *
     * @param apiKey the API key
     * @param secret the Secret
     *
     * @return the eos api client factory
     */
    public static EosApiClientFactory newInstance(String apiKey, String secret, String baseUrl, Proxy proxy) {
        return new EosApiClientFactory(apiKey, secret, baseUrl, proxy);
    }

    /**
     * New instance without authentication.
     *
     * @return the eos api client factory
     */
    public static EosApiClientFactory newInstance() {
        return new EosApiClientFactory(null, null, null, null);
    }

    /**
     * Creates a new synchronous/blocking REST client.
     */
    public EosApiRestClient newRestClient() {
        return new EosApiRestClientImpl(apiKey, secret, baseUrl, proxy);
    }

}
