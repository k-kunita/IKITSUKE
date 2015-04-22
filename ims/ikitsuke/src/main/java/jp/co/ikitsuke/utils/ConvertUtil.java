package jp.co.ikitsuke.utils;

import java.util.ArrayList;
import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.form.CategoryAddInputForm;
import jp.co.ikitsuke.form.CategoryEditInputForm;
import jp.co.ikitsuke.form.part.ShopCategoryPart;
import jp.co.ikitsuke.form.part.ShopInfoPart;
import jp.co.ikitsuke.model.ShopCategoryModel;
import jp.co.ikitsuke.model.ShopInfoModel;

import org.springframework.beans.BeanUtils;

/***
 * 便利共通メソッド
 * 
 * @author yositune64
 *
 */
public class ConvertUtil {

    private ConvertUtil() {
    };

    /***
     * 文字列をbooleanに変換する
     * 
     * <pre>
     * 入力値が０の場合はfalse、１の場合はtrueを返す。
     * その他の文字列が入力された場合はfalseを返す。
     * </pre>
     * 
     * @param flg
     * @return
     */
    public static boolean convertStringFlg(String inputStr) {

        boolean resultFlg = false;
        // 入力値が１の場合はtrueをセット
        if (inputStr.equals("1")) {
            resultFlg = true;
        }

        return resultFlg;
    }

    /***
     * ShopCategoryMpdelをPartクラスに変換
     * 
     * <pre>
     * 引数がnullの場合はnullを返す
     * </pre>
     * 
     * @param model
     * @return
     */
    public static ShopCategoryPart toShopCategoryPart(ShopCategoryModel model) {

        ShopCategoryPart part = null;

        if (model != null) {
            part = new ShopCategoryPart();
            BeanUtils.copyProperties(model, part);
        }

        return part;
    }

    /***
     * ShopCategoryMpdelのListをPartのListに変換
     * 
     * <pre>
     * 引数がnullの場合はnullを返す
     * </pre>
     * 
     * @param modelList
     * @return
     */
    public static List<ShopCategoryPart> toShopCategoryParts(List<ShopCategoryModel> modelList) {
        List<ShopCategoryPart> partList = null;

        if (modelList != null && !modelList.isEmpty()) {
            partList = new ArrayList<>();
            // リスト内のModelをすべて変換
            for (ShopCategoryModel model : modelList) {
                partList.add(toShopCategoryPart(model));
            }
        }

        return partList;
    }

    /***
     * ShopInfoMpdelをPartクラスに変換
     * 
     * <pre>
     * 引数がnullの場合はnullを返す
     * </pre>
     * 
     * @param model
     * @return
     */
    public static ShopInfoPart toShopInfoPart(ShopInfoModel model) {

        ShopInfoPart part = null;

        if (model != null) {
            part = new ShopInfoPart();
            BeanUtils.copyProperties(model, part);
        }

        return part;
    }

    /***
     * ShopInfoMpdelのListをPartのListに変換
     * 
     * <pre>
     * 引数がnullの場合はnullを返す
     * </pre>
     * 
     * @param modelList
     * @return
     */
    public static List<ShopInfoPart> toShopInfoParts(List<ShopInfoModel> modelList) {

        List<ShopInfoPart> partList = null;

        if (modelList != null && !modelList.isEmpty()) {
            partList = new ArrayList<>();
            // リスト内のModelをすべて変換
            for (ShopInfoModel model : modelList) {
                partList.add(toShopInfoPart(model));
            }
        }

        return partList;
    }
    
    /***
     * ShopCategoryMpdelをFormクラスに変換
     * <pre>
     * 引数がnullの場合はnullを返す
     * </pre>
     * @param model
     * @return
     */
    public static CategoryEditInputForm toCategoryEditInputForm(ShopCategoryModel model) {

        CategoryEditInputForm form = null;

        if (model != null) {
            form = new CategoryEditInputForm();
            BeanUtils.copyProperties(model, form);
        }

        return form;
    }
    
    /***
     * ShopCategoryMpdelをFormクラスに変換
     * <pre>
     * 引数がnullの場合はnullを返す
     * </pre>
     * @param model
     * @return
     */
    public static CategoryAddInputForm toCategoryAddInputForm(ShopCategoryModel model) {

        CategoryAddInputForm form = null;

        if (model != null) {
            form = new CategoryAddInputForm();
            BeanUtils.copyProperties(model, form);
        }

        return form;
    }
    
    /***
     * ShopCategoryMpdelをEntityクラスに変換
     * <pre>
     * 引数がnullの場合はnullを返す
     * </pre>
     * @param model
     * @return entity
     */
    public static ShopCategory toShopCategory(ShopCategoryModel model) {

        ShopCategory entity = null;

        if (model != null) {
            entity = new ShopCategory();
            BeanUtils.copyProperties(model, entity);
        }

        return entity;
    }
    
}
