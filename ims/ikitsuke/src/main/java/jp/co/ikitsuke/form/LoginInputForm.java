/**
 *
 */
package jp.co.ikitsuke.form;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;


/**
 * ログイン画面<br>
 * ログインボタン Input<br>
 *
 * @author watanabe
 *
 */
public class LoginInputForm {

    /** メールアドレス */
    @Email
    private String mailAddress;

    @NotEmpty
    @Length(min = 10,max = 99)
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
