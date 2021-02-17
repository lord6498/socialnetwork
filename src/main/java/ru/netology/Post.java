package ru.netology;

public class Post {

    private int id;
    private int postPonedId; //отложенная запись
    private int idWhoPublished; //id того кто публикует
    private int idWherePublished; //id стены где публикуют
    private int createdBy; //идентификатор администратора сообщества
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int markedAsAds;
    private int date;
    private int signerGroupId;
    private boolean friendly;
    private boolean pinned;
    private boolean canPin;
    private boolean canDelete;
    private boolean isFavoutire;
    private Comment comentsInfo;
    private Repost repostInfo;
    private Like likeInfo;
    private Geo geoInfo;
    private View viewInfo;
    private Copyright copyrightInfo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostPonedId() {
        return postPonedId;
    }

    public void setPostPonedId(int postPonedId) {
        this.postPonedId = postPonedId;
    }

    public int getIdWhoPublished() {
        return idWhoPublished;
    }

    public void setIdWhoPublished(int idWhoPublished) {
        this.idWhoPublished = idWhoPublished;
    }

    public int getIdWherePublished() {
        return idWherePublished;
    }

    public void setIdWherePublished(int idWherePublished) {
        this.idWherePublished = idWherePublished;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getSignerGroupId() {
        return signerGroupId;
    }

    public void setSignerGroupId(int signerGroupId) {
        this.signerGroupId = signerGroupId;
    }

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isFavoutire() {
        return isFavoutire;
    }

    public void setFavoutire(boolean favoutire) {
        isFavoutire = favoutire;
    }

    public Comment getComentsInfo() {
        return comentsInfo;
    }

    public void setComentsInfo(Comment comentsInfo) {
        this.comentsInfo = comentsInfo;
    }

    public Repost getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(Repost repostInfo) {
        this.repostInfo = repostInfo;
    }

    public Like getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(Like likeInfo) {
        this.likeInfo = likeInfo;
    }

    public Geo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(Geo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public View getViewInfo() {
        return viewInfo;
    }

    public void setViewInfo(View viewInfo) {
        this.viewInfo = viewInfo;
    }

    public Copyright getCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(Copyright copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }
}
