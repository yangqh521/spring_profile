package com.recover.yqh.entity;

import java.util.Date;

public class IdeaInfo {
    private Integer ideaId;

    private Integer planId;

    private Integer unitId;

    private Integer userId;

    private String ideaName;

    private String adSlotIds;

    private Integer assetId;

    private String landingPage;

    private String impressionUrl;

    private String clickUrl;

    private Byte status;

    private Integer adminStatus;

    private Integer ideaType;

    private Byte isDelete;

    private Date createTime;

    private Date lastModifyTime;

    private Byte assetType;

    public Integer getIdeaId() {
        return ideaId;
    }

    public void setIdeaId(Integer ideaId) {
        this.ideaId = ideaId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIdeaName() {
        return ideaName;
    }

    public void setIdeaName(String ideaName) {
        this.ideaName = ideaName == null ? null : ideaName.trim();
    }

    public String getAdSlotIds() {
        return adSlotIds;
    }

    public void setAdSlotIds(String adSlotIds) {
        this.adSlotIds = adSlotIds == null ? null : adSlotIds.trim();
    }

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public String getLandingPage() {
        return landingPage;
    }

    public void setLandingPage(String landingPage) {
        this.landingPage = landingPage == null ? null : landingPage.trim();
    }

    public String getImpressionUrl() {
        return impressionUrl;
    }

    public void setImpressionUrl(String impressionUrl) {
        this.impressionUrl = impressionUrl == null ? null : impressionUrl.trim();
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl == null ? null : clickUrl.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Integer getIdeaType() {
        return ideaType;
    }

    public void setIdeaType(Integer ideaType) {
        this.ideaType = ideaType;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Byte getAssetType() {
        return assetType;
    }

    public void setAssetType(Byte assetType) {
        this.assetType = assetType;
    }
}