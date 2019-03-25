package com.stu.pattern.prototype.refactor;

import java.util.Date;

public class UserPlayRecord {
    //播放记录编号
    private Long id;
    //用户ID
    private Long userId;
    //联想用户ID
    private String lenovoUserId;
    //模式 0：默认 1：儿童模式
    private String mode;
    //剧集ID
    private Long conAlbumId;
    //cp剧集ID
    private String outConAlbumId;
    //子剧集ID
    private Long conContentId;
    //cp子剧集ID
    private String outConContentId;
    //一级分类
    private String category1Ids;
    //二级分类
    private String category2Ids;
    //播放内容名称
    private String contentName;
    //播放地址
    private String playUrl;
    //海报
    private String poster;
    //PLATFORM
    private Long platform;
    //创建时间
    private Date cDate;
    //更新时间
    private Date uDate;
    //最后上报时间
    private String updateTime;
    //是否删除
    private String  status;
    //播放记录时间
    private Long currPlayTime;
    //总时长
    private Long duration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLenovoUserId() {
        return lenovoUserId;
    }

    public void setLenovoUserId(String lenovoUserId) {
        this.lenovoUserId = lenovoUserId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Long getConAlbumId() {
        return conAlbumId;
    }

    public void setConAlbumId(Long conAlbumId) {
        this.conAlbumId = conAlbumId;
    }

    public String getOutConAlbumId() {
        return outConAlbumId;
    }

    public void setOutConAlbumId(String outConAlbumId) {
        this.outConAlbumId = outConAlbumId;
    }

    public Long getConContentId() {
        return conContentId;
    }

    public void setConContentId(Long conContentId) {
        this.conContentId = conContentId;
    }

    public String getOutConContentId() {
        return outConContentId;
    }

    public void setOutConContentId(String outConContentId) {
        this.outConContentId = outConContentId;
    }

    public String getCategory1Ids() {
        return category1Ids;
    }

    public void setCategory1Ids(String category1Ids) {
        this.category1Ids = category1Ids;
    }

    public String getCategory2Ids() {
        return category2Ids;
    }

    public void setCategory2Ids(String category2Ids) {
        this.category2Ids = category2Ids;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Long getPlatform() {
        return platform;
    }

    public void setPlatform(Long platform) {
        this.platform = platform;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Date getuDate() {
        return uDate;
    }

    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCurrPlayTime() {
        return currPlayTime;
    }

    public void setCurrPlayTime(Long currPlayTime) {
        this.currPlayTime = currPlayTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
