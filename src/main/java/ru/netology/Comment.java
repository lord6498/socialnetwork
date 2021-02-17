package ru.netology;

public class Comment {
    private int count;
    private boolean canPosting;
    private boolean canGroupPosting;
    private boolean lockComment;
    private boolean canClose;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPosting() {
        return canPosting;
    }

    public void setCanPosting(boolean canPosting) {
        this.canPosting = canPosting;
    }

    public boolean isCanGroupPosting() {
        return canGroupPosting;
    }

    public void setCanGroupPosting(boolean canGroupPosting) {
        this.canGroupPosting = canGroupPosting;
    }

    public boolean isLockComment() {
        return lockComment;
    }

    public void setLockComment(boolean lockComment) {
        this.lockComment = lockComment;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
