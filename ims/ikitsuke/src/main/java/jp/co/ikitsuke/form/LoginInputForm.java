/**
 *
 */
package jp.co.ikitsuke.form;

/**
 * ログイン画面<br>
 * ログインボタン Input<br>
 *
 * @author watanabe
 *
 */
public class LoginInputForm {

    /** メールアドレス */
    private String mailAddress;

    /** ログインパスワード */
    private String loginPassword;

    /**
     * メールアドレスを取得する
     *
     * @return mail_address
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

}
