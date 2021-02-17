package ru.netology;

public class Post {

    private int id;
    private int idWhoPublished;
    private int idWherePublished;
    private int date;
    private boolean friendly;
    private boolean pinned;
    private boolean canDelete;
    private Comment comentsInfo;
    private Repost repostInfo;
    private Like likeInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
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

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
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
}
