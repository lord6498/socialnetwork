package ru.netology;

public class Like {
    private int count;
    private int likeFromUser;
    private boolean canLike;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLikeFromUser() {
        return likeFromUser;
    }

    public void setLikeFromUser(int likeFromUser) {
        this.likeFromUser = likeFromUser;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }
}
