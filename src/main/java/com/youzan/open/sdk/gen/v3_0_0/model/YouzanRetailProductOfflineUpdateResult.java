package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanRetailProductOfflineUpdateResult implements APIResult {

    @JsonProperty(value = "update_result")
    /**
     * 是否编辑成功
     */
    private Boolean updateResult;

    public void setUpdateResult(Boolean updateResult) {
        this.updateResult = updateResult;
    }

    public Boolean getUpdateResult() {
        return this.updateResult;
    }


}