package jp.co.ikitsuke.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/***
 * 例外ハンドラー
 * <pre>
 * コントローラ内で例外が発生した場合、内容に関係なくerror.jspを表示する。
 * </pre>
 * @author yositune64
 *
 */
public class CustomHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) {

        ModelAndView mav = new ModelAndView();

        // 遷移先のJSPを指定します。(error.jspに遷移します。)
        mav.setViewName("error");
        return mav;

    }
}
