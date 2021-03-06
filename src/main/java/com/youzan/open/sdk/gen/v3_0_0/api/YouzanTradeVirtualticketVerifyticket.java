package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeVirtualticketVerifyticketResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeVirtualticketVerifyticketParams;

public class YouzanTradeVirtualticketVerifyticket extends AbstractAPI {

    public YouzanTradeVirtualticketVerifyticket() {
    }

    public YouzanTradeVirtualticketVerifyticket(YouzanTradeVirtualticketVerifyticketParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.virtualticket.verifyticket";
    }

    public Class getResultModelClass() {
        return YouzanTradeVirtualticketVerifyticketResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeVirtualticketVerifyticketParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}