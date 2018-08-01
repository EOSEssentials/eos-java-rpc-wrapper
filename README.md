# EOS Java API Wrapper

*A Java implementation of the EOS RPC Calls. Under the [MIT Licence](https://raw.githubusercontent.com/Fletch153/eos-java-rpc-wrapper/master/LICENSE)*.

Created by [eos42](http://www.eos42.io).

The api documentation can be found in the official eos developers portal:
https://developers.eos.io/eosio-nodeos/reference

All but the following queries are supported:
1. CHAIN
- get_header_block_state
- get_producers
- push_block
2. WALLET
- set_dir
- set_eosio_key
3. NET
- connect
- disconnect
- connections
- status
4. PRODUCER
- pause
- resume
- paused

#### Requirements
* Java 8
* Maven

#### Installation
Install using maven build tool. The artifact will need to be published locally.

Currently the artifiac is not in the official maven repositories.
If you want to use it in a maven build, you can add the following repository

``` xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

and dependency

``` xml
<dependency>
    <groupId>com.github.EOSEssentials</groupId>
    <artifactId>eos-java-rpc-wrapper</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```

#### Configuration
Create a new instance of EosApiClient using the EosApiClientFactory, this will require
a baseurl to be passed in.

This will use the same base url for all three api endpoints (history/chain/wallet).
```java
EosApiRestClient eosApiRestClient = EosApiClientFactory.newInstance("http://127.0.0.1:8888").newRestClient();
```

If you want to use separate urls for those endpoints (e.g. you have a local wallet):
```java
EosApiRestClient eosApiRestClient = EosApiClientFactory.newInstance(
    walletBaseUrl, chainBaseUrl, historyBaseUrl).newRestClient();
```

#### Example Usage
##### Creating a wallet
```java
eosApiRestClient.createWallet("walletName");
```

#### Getting a block
```java
eosApiRestClient.getBlock("blockNumberOrId")
```

#### Signing and pushing a transaction

```java
/* Create the rest client */
EosApiRestClient eosApiRestClient = EosApiClientFactory.newInstance("http://127.0.0.1:8888").newRestClient();

/* Create the json array of arguments */
Map<String, String> args = new HashMap<>(4);
args.put("from", "currency");
args.put("to", "eosio");
args.put("quantity", "44.0000 CUR");
args.put("memo", "My First Transaction");
AbiJsonToBin data = eosApiRestClient.abiJsonToBin("currency", "transfer", args);```

/* Get the head block */
Block block = eosApiRestClient.getBlock(eosApiRestClient.getChainInfo().getHeadBlockId());

/* Create Transaction Action Authorization */
TransactionAuthorization transactionAuthorization = new TransactionAuthorization();
transactionAuthorization.setActor("currency");
transactionAuthorization.setPermission("active");

/* Create Transaction Action */
TransactionAction transactionAction = new TransactionAction();
transactionAction.setAccount("currency");
transactionAction.setName("transfer");
transactionAction.setData(data.getBinargs());
transactionAction.setAuthorization(Collections.singletonList(transactionAuthorization));

/* Create a transaction */
PackedTransaction packedTransaction = new PackedTransaction();
packedTransaction.setRefBlockPrefix(block.getRefBlockPrefix().toString());
packedTransaction.setRefBlockNum(block.getBlockNum().toString());
packedTransaction.setExpiration("2018-05-10T18:38:19");
packedTransaction.setRegion("0");
packedTransaction.setMax_net_usage_words("0");
packedTransaction.setActions(Collections.singletonList(transactionAction));

/* Sign the Transaction */
SignedPackedTransaction signedPackedTransaction = eosApiRestClient.signTransaction(packedTransaction, Collections.singletonList("EOS7LPJ7YnwYiEHbBLz96fNkt3kf6CDDdesV5EsWoc3u3DJy31V2y"), "chainId");

/* Push the transaction */
PushedTransaction = eosApiRestClient.pushTransaction("none", signedPackedTransaction);
```

#### Notes
* All methods are synchronous and blocking.
* All methods will throw a catchable EOSApiException.
