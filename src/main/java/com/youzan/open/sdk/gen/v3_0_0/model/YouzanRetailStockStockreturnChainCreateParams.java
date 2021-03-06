package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanRetailStockStockreturnChainCreateParams implements APIParams, FileParams  {

    /**
     * 业务时间
     */
    private String businessTime;
    /**
     * 幂等单号(请求唯一标识)
     */
    private String idempotentNo;
    /**
     * 是否将库存盘点成0，默认false不盘点
     */
    private Boolean isNeedPd;
    /**
     * 入库备注
     */
    private String remark;
    /**
     * 请求来源（需调用方自定义标识：OPEN_XXXX）
     */
    private String retailSource;
    /**
     * 退货单明细
     */
    private String stockReturnOrderItems;
    /**
     * 入库的仓库或门店id
     */
    private Long warehouseId;

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public String getBusinessTime() {
        return this.businessTime;
    }

    public void setIdempotentNo(String idempotentNo) {
        this.idempotentNo = idempotentNo;
    }

    public String getIdempotentNo() {
        return this.idempotentNo;
    }

    public void setIsNeedPd(Boolean isNeedPd) {
        this.isNeedPd = isNeedPd;
    }

    public Boolean getIsNeedPd() {
        return this.isNeedPd;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRetailSource(String retailSource) {
        this.retailSource = retailSource;
    }

    public String getRetailSource() {
        return this.retailSource;
    }

    public void setStockReturnOrderItems(String stockReturnOrderItems) {
        this.stockReturnOrderItems = stockReturnOrderItems;
    }

    public String getStockReturnOrderItems() {
        return this.stockReturnOrderItems;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (businessTime != null) {
            params.put("business_time", businessTime);
        }
        if (idempotentNo != null) {
            params.put("idempotent_no", idempotentNo);
        }
        if (isNeedPd != null) {
            params.put("is_need_pd", isNeedPd);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (retailSource != null) {
            params.put("retail_source", retailSource);
        }
        if (stockReturnOrderItems != null) {
            params.put("stock_return_order_items", stockReturnOrderItems);
        }
        if (warehouseId != null) {
            params.put("warehouse_id", warehouseId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}