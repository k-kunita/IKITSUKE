package jp.co.ikitsuke.model;

import java.util.Date;
import java.util.List;

/**
 * ログイン情報モデル
 *
 * @author watanabe
 *
 */
public class LoginModel {

    /** ユーザID */
    private int userId;

    /** メールアドレス */
    private String mailAddress;

    /** ログインパスワード */
    private String loginPassword;

    /** 登録日付 (YYYYMMDDHHMM) */
    private Date createDateTime;

    /** 更新日付 (YYYYMMDDHHMM) */
    private Date updateTime;

    /** 店舗カテゴリリスト */
    private List<ShopCategoryModel> shopCategoryList;

    /**
     * ユーザIDを取得する
     *
     * @return userId
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * ユーザIDを設定する
     *
     * @param userId
     *            セットする userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * メールアドレスを取得する
     *
     * @return mailAddress
     */
    public String getMailAddress() {
        return this.mailAddress;
    }

    /**
     * メールアドレスを設定する
     *
     * @param mailAddress
     *            セットする mailAddress
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /**
     * ログインパスワードを取得する
     *
     * @return loginPassword
     */
    public String getLoginPassword() {
        return this.loginPassword;
    }

    /**
     * ログインパスワードを設定する
     *
     * @param loginPassword
     *            セットする loginPassword
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    /**
     * 登録日付 (YYYYMMDDHHMM)を取得する
     *
     * @return createDateTime
     */
    public Date getCreateDateTime() {
        return this.createDateTime;
    }

    /**
     * 登録日付 (YYYYMMDDHHMM)を設定する
     *
     * @param createDateTime
     *            セットする createDateTime
     */
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * 更新日付 (YYYYMMDDHHMM)を取得する
     *
     * @return updateTime
     */
    public Date getLastUpdateTime() {
        return this.updateTime;
    }

    /**
     * 更新日付 (YYYYMMDDHHMM)を設定する
     *
     * @param updateTime
     *            セットする updateTime
     */
    public void setLastUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 店舗カテゴリリストを取得する
     *
     * @return shopCategoryList
     */
    public List<ShopCategoryModel> getShopCategoryList() {
        return this.shopCategoryList;
    }

    /**
     * 店舗カテゴリリストを設定する
     *
     * @param shopCategoryList
     *            セットする shopCategoryList
     */
    public void setShopCategoryList(List<ShopCategoryModel> shopCategoryList) {
        this.shopCategoryList = shopCategoryList;
    }

}
