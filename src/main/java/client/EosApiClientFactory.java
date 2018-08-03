package client;

import client.impl.EosApiRestClientImpl;

public class EosApiClientFactory {

    private String baseUrl;

    private String walletBaseUrl;

    private String chainBaseUrl;

    private String historyBaseUrl;

    private EosApiClientFactory(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    private EosApiClientFactory(String walletBaseUrl, String chainBaseUrl, String historyBaseUrl) {
        this.walletBaseUrl = walletBaseUrl;
        this.chainBaseUrl = chainBaseUrl;
        this.historyBaseUrl = historyBaseUrl;
    }

    public static EosApiClientFactory newInstance(String baseUrl) {
        return new EosApiClientFactory(baseUrl);
    }

    public static EosApiClientFactory newInstance(String walletBaseUrl, String chainBaseUrl, String historyBaseUrl) {
        return new EosApiClientFactory(walletBaseUrl, chainBaseUrl, historyBaseUrl);
    }

    public EosApiRestClient newRestClient() {
        return baseUrl != null
            ? new EosApiRestClientImpl(baseUrl)
            : new EosApiRestClientImpl(walletBaseUrl, chainBaseUrl, historyBaseUrl);
    }

}
