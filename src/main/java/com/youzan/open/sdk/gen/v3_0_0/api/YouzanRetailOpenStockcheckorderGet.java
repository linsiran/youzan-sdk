package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockcheckorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockcheckorderGetParams;

public class YouzanRetailOpenStockcheckorderGet extends AbstractAPI {

    public YouzanRetailOpenStockcheckorderGet() {
    }

    public YouzanRetailOpenStockcheckorderGet(YouzanRetailOpenStockcheckorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stockcheckorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockcheckorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockcheckorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}