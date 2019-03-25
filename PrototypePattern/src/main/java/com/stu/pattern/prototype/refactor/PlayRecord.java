package com.stu.pattern.prototype.refactor;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class PlayRecord {
        /** 主键ID*/
        private Long recordId;
        /** 剧集编号 */
        private Long conAlbumId;
        /** cp剧集编号 */
        private String outConAlbumId;
        /** 子剧集编号 */
        private Long conContentId;
        /** 播放内容名称 */
        private String contentName;
        /** 模式 */
        private String mode;
        /** 播放地址 */
        private String playUrl;
        /**  海报url */
        private String poster="";
        /** 修改时间 */
        private String updateTime;
        /** 修改时间2 */
        private Date updateTime2;
        /** 当前影视播放时间 */
        private Long currPlayTime;
        /** cp子剧集编号 */
        private String outConContentId;
        /** cpId */
        private String cpId;
        /** 剧集时间 */
        private String duration = "";
        /** 剧集时间 */
        private Long durationL = 0L;
        /** 剩余时间 */
        private String remainIngTime = "";
        /** 是否为剧集0：电影1：电视剧、综艺 */
        private String albumType;
        /** 下一集 子剧集编号 */
        private Long nextConContentId = 0L;
        /** 下一集 cp子剧集编号  */
        private String nextOutConContentId = "0";
        /** 播放内容名称 */
        private String nextContentName = "";
        /** 当前集数 */
        private String orderNumber;
        /** 下一集数 */
        private String nextOrderNumber;
        /** 是否是正片 */
        private String isMain;
        /** 一级分类 */
        private String category1Ids;
        /** 二级分类 */
        private String category2Ids;
        /** 是否是VIP视频 */
        private String payMark;
        /** 是否可播放 */
        private String isPlay;
        /** 上次播放平台 */
        private Long platform;

        public Long getRecordId() {
                return recordId;
        }

        public void setRecordId(Long recordId) {
                this.recordId = recordId;
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

        public String getContentName() {
                return contentName;
        }

        public void setContentName(String contentName) {
                this.contentName = contentName;
        }

        public String getMode() {
                return mode;
        }

        public void setMode(String mode) {
                this.mode = mode;
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

        public String getUpdateTime() {
                return updateTime;
        }

        public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
        }

        public Date getUpdateTime2() {
                return updateTime2;
        }

        public void setUpdateTime2(Date updateTime2) {
                this.updateTime2 = updateTime2;
        }

        public Long getCurrPlayTime() {
                return currPlayTime;
        }

        public void setCurrPlayTime(Long currPlayTime) {
                this.currPlayTime = currPlayTime;
        }

        public String getOutConContentId() {
                return outConContentId;
        }

        public void setOutConContentId(String outConContentId) {
                this.outConContentId = outConContentId;
        }

        public String getCpId() {
                return cpId;
        }

        public void setCpId(String cpId) {
                this.cpId = cpId;
        }

        public String getDuration() {
                return duration;
        }

        public void setDuration(String duration) {
                this.duration = duration;
        }

        public Long getDurationL() {
                return durationL;
        }

        public void setDurationL(Long durationL) {
                this.durationL = durationL;
        }

        public String getRemainIngTime() {
                return remainIngTime;
        }

        public void setRemainIngTime(String remainIngTime) {
                this.remainIngTime = remainIngTime;
        }

        public String getAlbumType() {
                return albumType;
        }

        public void setAlbumType(String albumType) {
                this.albumType = albumType;
        }

        public Long getNextConContentId() {
                return nextConContentId;
        }

        public void setNextConContentId(Long nextConContentId) {
                this.nextConContentId = nextConContentId;
        }

        public String getNextOutConContentId() {
                return nextOutConContentId;
        }

        public void setNextOutConContentId(String nextOutConContentId) {
                this.nextOutConContentId = nextOutConContentId;
        }

        public String getNextContentName() {
                return nextContentName;
        }

        public void setNextContentName(String nextContentName) {
                this.nextContentName = nextContentName;
        }

        public String getOrderNumber() {
                return orderNumber;
        }

        public void setOrderNumber(String orderNumber) {
                this.orderNumber = orderNumber;
        }

        public String getNextOrderNumber() {
                return nextOrderNumber;
        }

        public void setNextOrderNumber(String nextOrderNumber) {
                this.nextOrderNumber = nextOrderNumber;
        }

        public String getIsMain() {
                return isMain;
        }

        public void setIsMain(String isMain) {
                this.isMain = isMain;
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

        public String getPayMark() {
                return payMark;
        }

        public void setPayMark(String payMark) {
                this.payMark = payMark;
        }

        public String getIsPlay() {
                return isPlay;
        }

        public void setIsPlay(String isPlay) {
                this.isPlay = isPlay;
        }

        public Long getPlatform() {
                return platform;
        }

        public void setPlatform(Long platform) {
                this.platform = platform;
        }

        @Override
        public String toString() {
                return "PlayRecord{" +
                        "conAlbumId=" + conAlbumId +
                        ", conContentId=" + conContentId +
                        ", category1Ids='" + category1Ids + '\'' +
                        ", category2Ids='" + category2Ids + '\'' +
                        '}';
        }
}
