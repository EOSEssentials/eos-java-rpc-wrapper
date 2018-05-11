#EOS Java API Wrapper

*A Java implementation of the EOS RPC Calls. Under the [MIT Licence](https://raw.githubusercontent.com/Fletch153/eos-java-rpc-wrapper/master/LICENSE)*. 

Created by [Chintai](http://www.chintai-eos.io).


####Requirements
* Java 8
* Maven

####Installation
Install using maven build tool. The artifact will need to be published locally.

####Configuration
Create a new instance of EosApiClient using the EosApiClientFactory, this will require
a baseurl to be passed in.

```EosApiRestClient eosApiRestClient = EosApiClientFactory.newInstance("http://127.0.0.1:8888").newRestClient();```


####Example Usage
##### Creating a wallet
```eosApiRestClient.createWallet("walletName");```

#### Getting a block
```eosApiRestClient.getBlock("blockNumberOrId")```

#### Signing and pushing a transaction

```
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
packedTransaction.setContextFreeData(Collections.emptyList());
packedTransaction.setContextFreeActions(Collections.emptyList());
packedTransaction.setActions(Collections.singletonList(transactionAction));

/* Sign the Transaction */
SignedPackedTransaction signedPackedTransaction = eosApiRestClient.signTransaction(packedTransaction, Collections.singletonList("EOS7LPJ7YnwYiEHbBLz96fNkt3kf6CDDdesV5EsWoc3u3DJy31V2y"), "chainId");

/* Push the transaction */
PushedTransaction = eosApiRestClient.pushTransaction("none", signedPackedTransaction);
```

####Notes
* All methods are synchronous and blocking.
* All methods will throw a catchable EOSApiException.

