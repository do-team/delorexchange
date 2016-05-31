package model;


public class User {

    private Integer userId;

    @SuppressWarnings("unused")
    private User() {
    }

    /**
     * @param userId
     */
    public User(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
