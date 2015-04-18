package jp.co.ikitsuke.logic;

import jp.co.ikitsuke.model.LoginModel;

/***
 * ログイン処理
 *
 * @author yositune64
 *
 */
public interface LoginLogic {

    /***
     * ログイン処理
     * 
     * <pre>
     * 入力値のユーザが存在する場合、セッションを作成しtrueを返す。
     * 存在しない場合はfalseを返す。
     * </pre>
     * 
     * @param mailAddress
     * @param loginPassword
     * @return ログイン可否
     */
    public LoginModel executeLogin(String mailAddress, String loginPassword);
    
    
    /***
     * ログインモデル取得
     * <pre>
     * メールアドレスよりログインモデルを取得する。
     * </pre>
     * @param mailAddress
     * @return ログインモデル
     */
    public LoginModel getModel(String mailAddress);
    
}
