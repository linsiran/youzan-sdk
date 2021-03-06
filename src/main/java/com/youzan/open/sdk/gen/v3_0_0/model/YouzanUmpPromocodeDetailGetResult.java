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

public class YouzanUmpPromocodeDetailGetResult implements APIResult {

    @JsonProperty(value = "id")
    /**
     * 卡劵ID
     */
    private Long id;
    @JsonProperty(value = "kdt_id")
    /**
     * 商家ID
     */
    private Long kdtId;
    @JsonProperty(value = "coupon_group_id")
    /**
     * 活动ID
     */
    private Long couponGroupId;
    @JsonProperty(value = "preferential_type")
    /**
     * 优惠类型
     */
    private Long preferentialType;
    @JsonProperty(value = "value")
    /**
     * 优惠面额
     */
    private Long value;
    @JsonProperty(value = "code")
    /**
     * 优惠码
     */
    private String code;
    @JsonProperty(value = "is_used")
    /**
     * 是否被使用 0:否 1:是
     */
    private Long isUsed;
    @JsonProperty(value = "is_take")
    /**
     * 是否被领取 0:否 1:是
     */
    private Long isTake;
    @JsonProperty(value = "take_at")
    /**
     * 领取时间
     */
    private Date takeAt;
    @JsonProperty(value = "used_value")
    /**
     * 订单中优惠面额（单位：分）
     */
    private Long usedValue;
    @JsonProperty(value = "used_at")
    /**
     * 使用时间
     */
    private Date usedAt;
    @JsonProperty(value = "used_in_order_no")
    /**
     * 使用订单号
     */
    private String usedInOrderNo;
    @JsonProperty(value = "valid_start_at")
    /**
     * 有效开始时间
     */
    private Date validStartAt;
    @JsonProperty(value = "expire_at")
    /**
     * 有效过期时间
     */
    private Date expireAt;
    @JsonProperty(value = "is_sync_card")
    /**
     * 是否同步微信卡劵 0:否 1:是
     */
    private Long isSyncCard;
    @JsonProperty(value = "verify_code")
    /**
     * 核销码
     */
    private String verifyCode;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }
    public void setCouponGroupId(Long couponGroupId) {
        this.couponGroupId = couponGroupId;
    }

    public Long getCouponGroupId() {
        return this.couponGroupId;
    }
    public void setPreferentialType(Long preferentialType) {
        this.preferentialType = preferentialType;
    }

    public Long getPreferentialType() {
        return this.preferentialType;
    }
    public void setValue(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
    public void setIsUsed(Long isUsed) {
        this.isUsed = isUsed;
    }

    public Long getIsUsed() {
        return this.isUsed;
    }
    public void setIsTake(Long isTake) {
        this.isTake = isTake;
    }

    public Long getIsTake() {
        return this.isTake;
    }
    public void setTakeAt(Date takeAt) {
        this.takeAt = takeAt;
    }

    public Date getTakeAt() {
        return this.takeAt;
    }
    public void setUsedValue(Long usedValue) {
        this.usedValue = usedValue;
    }

    public Long getUsedValue() {
        return this.usedValue;
    }
    public void setUsedAt(Date usedAt) {
        this.usedAt = usedAt;
    }

    public Date getUsedAt() {
        return this.usedAt;
    }
    public void setUsedInOrderNo(String usedInOrderNo) {
        this.usedInOrderNo = usedInOrderNo;
    }

    public String getUsedInOrderNo() {
        return this.usedInOrderNo;
    }
    public void setValidStartAt(Date validStartAt) {
        this.validStartAt = validStartAt;
    }

    public Date getValidStartAt() {
        return this.validStartAt;
    }
    public void setExpireAt(Date expireAt) {
        this.expireAt = expireAt;
    }

    public Date getExpireAt() {
        return this.expireAt;
    }
    public void setIsSyncCard(Long isSyncCard) {
        this.isSyncCard = isSyncCard;
    }

    public Long getIsSyncCard() {
        return this.isSyncCard;
    }
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }


}