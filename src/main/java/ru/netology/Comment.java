package ru.netology;

public class Comment {
    private int count;
    private boolean canPosting;
    private boolean canGroupPosting;
    private boolean lockComment;

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
}
