package com.smallwei.retrofitdemo;

import java.util.List;

/**
 * Created by smallwei on 2016/3/13.
 */
public class JavaBena {

    /**
     * uid : 2629577
     * downloadSize : 9094434
     * downloadUrl : http://download.xmcdn.com/group12/M06/E0/6A/wKgDW1aP5SbR8LdFAIrFIg-xTTA239.aac
     * albumTitle : 段子来了
     * playUrl32 : http://fdfs.xmcdn.com/group15/M03/DF/D2/wKgDaFaP5T-Bzx2CAIW630-B1HQ684.mp3
     * activityId : 0
     * categoryName : 综艺娱乐
     * smallLogo : http://fdfs.xmcdn.com/group3/M00/64/F8/wKgDslJ68TnQpnVPAAU-A1zGGqI128_mobile_small.jpg
     * processState : 2
     * coverSmall : http://fdfs.xmcdn.com/group15/M00/E3/06/wKgDZVaV5TiDUzcaAAHfLoO0750955_mobile_small.jpg
     * playUrl64 : http://fdfs.xmcdn.com/group15/M03/DF/A8/wKgDZVaP5S7TS8xCAQt1kOX_xqw197.mp3
     * albumId : 203355
     * status : 1
     * nickname : 枕边疯电台
     * categoryId : 4
     * msg : 0
     * shares : 74
     * isLike : false
     * likes : 6841
     * ret : 0
     * userSource : 1
     * playtimes : 1765023
     * coverLarge : http://fdfs.xmcdn.com/group15/M00/E3/06/wKgDZVaV5TiDUzcaAAHfLoO0750955_mobile_large.jpg
     * title : 段子来了丨​证监会不相信眼泪，老司机不相信快播有罪60108（采采）
     * createdAt : 1452271158000
     * downloadAacSize : 6763098
     * albumImage : http://fdfs.xmcdn.com/group5/M03/A6/D8/wKgDtlR1MD_T1DQHAANqZDyk48s720_mobile_meduim.jpg
     * userInfo : {"uid":2629577,"nickname":"枕边疯电台","isVerified":true,"smallLogo":"http://fdfs.xmcdn.com/group3/M00/64/F8/wKgDslJ68TnQpnVPAAU-A1zGGqI128_mobile_small.jpg","isFollowed":false,"followers":746334,"followings":37,"tracks":2658,"albums":19,"ptitle":"枕边夜话, 被窝陪伴,逆袭必听","personDescribe":"枕边夜话, 被窝陪伴,逆袭必听"}
     * trackBlocks : []
     * tags : 脱口秀,笑话段子,搞笑,热点,股市
     * trackId : 11418829
     * coverMiddle : http://fdfs.xmcdn.com/group15/M00/E3/06/wKgDZVaV5TiDUzcaAAHfLoO0750955_web_large.jpg
     * isPublic : true
     * intro : 本期内容：
     快播审判、股市熔断、朝鲜氢弹、段子来晚……
     谢谢大家支持

     微信公众号采采（caicaifm）
     微博@1053采采

     BGM：
     Hilary Duff - Sparks
     Christopher - Tulips
     * duration : 2190
     * downloadAacUrl : http://download.xmcdn.com/group15/M03/DF/D2/wKgDaFaP5TDz558tAGcyWpOfY0U673.m4a
     * playPathAacv164 : http://audio.xmcdn.com/group15/M03/DF/A8/wKgDZVaP5UGzZkKJAQ5dPOD7p7g386.m4a
     * playPathAacv224 : http://audio.xmcdn.com/group15/M03/DF/D2/wKgDaFaP5TDz558tAGcyWpOfY0U673.m4a
     * comments : 1117
     */

    private int uid;
    private int downloadSize;
    private String downloadUrl;
    private String albumTitle;
    private String playUrl32;
    private int activityId;
    private String categoryName;
    private String smallLogo;
    private int processState;
    private String coverSmall;
    private String playUrl64;
    private int albumId;
    private int status;
    private String nickname;
    private int categoryId;
    private String msg;
    private int shares;
    private boolean isLike;
    private int likes;
    private int ret;
    private int userSource;
    private int playtimes;
    private String coverLarge;
    private String title;
    private long createdAt;
    private int downloadAacSize;
    private String albumImage;
    /**
     * uid : 2629577
     * nickname : 枕边疯电台
     * isVerified : true
     * smallLogo : http://fdfs.xmcdn.com/group3/M00/64/F8/wKgDslJ68TnQpnVPAAU-A1zGGqI128_mobile_small.jpg
     * isFollowed : false
     * followers : 746334
     * followings : 37
     * tracks : 2658
     * albums : 19
     * ptitle : 枕边夜话, 被窝陪伴,逆袭必听
     * personDescribe : 枕边夜话, 被窝陪伴,逆袭必听
     */

    private UserInfoEntity userInfo;
    private String tags;
    private int trackId;
    private String coverMiddle;
    private boolean isPublic;
    private String intro;
    private int duration;
    private String downloadAacUrl;
    private String playPathAacv164;
    private String playPathAacv224;
    private int comments;
    private List<?> trackBlocks;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setDownloadSize(int downloadSize) {
        this.downloadSize = downloadSize;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public void setPlayUrl32(String playUrl32) {
        this.playUrl32 = playUrl32;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setSmallLogo(String smallLogo) {
        this.smallLogo = smallLogo;
    }

    public void setProcessState(int processState) {
        this.processState = processState;
    }

    public void setCoverSmall(String coverSmall) {
        this.coverSmall = coverSmall;
    }

    public void setPlayUrl64(String playUrl64) {
        this.playUrl64 = playUrl64;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public void setIsLike(boolean isLike) {
        this.isLike = isLike;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public void setUserSource(int userSource) {
        this.userSource = userSource;
    }

    public void setPlaytimes(int playtimes) {
        this.playtimes = playtimes;
    }

    public void setCoverLarge(String coverLarge) {
        this.coverLarge = coverLarge;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setDownloadAacSize(int downloadAacSize) {
        this.downloadAacSize = downloadAacSize;
    }

    public void setAlbumImage(String albumImage) {
        this.albumImage = albumImage;
    }

    public void setUserInfo(UserInfoEntity userInfo) {
        this.userInfo = userInfo;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public void setCoverMiddle(String coverMiddle) {
        this.coverMiddle = coverMiddle;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDownloadAacUrl(String downloadAacUrl) {
        this.downloadAacUrl = downloadAacUrl;
    }

    public void setPlayPathAacv164(String playPathAacv164) {
        this.playPathAacv164 = playPathAacv164;
    }

    public void setPlayPathAacv224(String playPathAacv224) {
        this.playPathAacv224 = playPathAacv224;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public void setTrackBlocks(List<?> trackBlocks) {
        this.trackBlocks = trackBlocks;
    }

    public int getUid() {
        return uid;
    }

    public int getDownloadSize() {
        return downloadSize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getPlayUrl32() {
        return playUrl32;
    }

    public int getActivityId() {
        return activityId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getSmallLogo() {
        return smallLogo;
    }

    public int getProcessState() {
        return processState;
    }

    public String getCoverSmall() {
        return coverSmall;
    }

    public String getPlayUrl64() {
        return playUrl64;
    }

    public int getAlbumId() {
        return albumId;
    }

    public int getStatus() {
        return status;
    }

    public String getNickname() {
        return nickname;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getMsg() {
        return msg;
    }

    public int getShares() {
        return shares;
    }

    public boolean isIsLike() {
        return isLike;
    }

    public int getLikes() {
        return likes;
    }

    public int getRet() {
        return ret;
    }

    public int getUserSource() {
        return userSource;
    }

    public int getPlaytimes() {
        return playtimes;
    }

    public String getCoverLarge() {
        return coverLarge;
    }

    public String getTitle() {
        return title;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public int getDownloadAacSize() {
        return downloadAacSize;
    }

    public String getAlbumImage() {
        return albumImage;
    }

    public UserInfoEntity getUserInfo() {
        return userInfo;
    }

    public String getTags() {
        return tags;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getCoverMiddle() {
        return coverMiddle;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public String getIntro() {
        return intro;
    }

    public int getDuration() {
        return duration;
    }

    public String getDownloadAacUrl() {
        return downloadAacUrl;
    }

    public String getPlayPathAacv164() {
        return playPathAacv164;
    }

    public String getPlayPathAacv224() {
        return playPathAacv224;
    }

    public int getComments() {
        return comments;
    }

    public List<?> getTrackBlocks() {
        return trackBlocks;
    }

    public static class UserInfoEntity {
        private int uid;
        private String nickname;
        private boolean isVerified;
        private String smallLogo;
        private boolean isFollowed;
        private int followers;
        private int followings;
        private int tracks;
        private int albums;
        private String ptitle;
        private String personDescribe;

        public void setUid(int uid) {
            this.uid = uid;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void setIsVerified(boolean isVerified) {
            this.isVerified = isVerified;
        }

        public void setSmallLogo(String smallLogo) {
            this.smallLogo = smallLogo;
        }

        public void setIsFollowed(boolean isFollowed) {
            this.isFollowed = isFollowed;
        }

        public void setFollowers(int followers) {
            this.followers = followers;
        }

        public void setFollowings(int followings) {
            this.followings = followings;
        }

        public void setTracks(int tracks) {
            this.tracks = tracks;
        }

        public void setAlbums(int albums) {
            this.albums = albums;
        }

        public void setPtitle(String ptitle) {
            this.ptitle = ptitle;
        }

        public void setPersonDescribe(String personDescribe) {
            this.personDescribe = personDescribe;
        }

        public int getUid() {
            return uid;
        }

        public String getNickname() {
            return nickname;
        }

        public boolean isIsVerified() {
            return isVerified;
        }

        public String getSmallLogo() {
            return smallLogo;
        }

        public boolean isIsFollowed() {
            return isFollowed;
        }

        public int getFollowers() {
            return followers;
        }

        public int getFollowings() {
            return followings;
        }

        public int getTracks() {
            return tracks;
        }

        public int getAlbums() {
            return albums;
        }

        public String getPtitle() {
            return ptitle;
        }

        public String getPersonDescribe() {
            return personDescribe;
        }
    }
}
