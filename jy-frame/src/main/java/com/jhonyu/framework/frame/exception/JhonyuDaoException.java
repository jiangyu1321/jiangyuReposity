package com.jhonyu.framework.frame.exception;

/**
 * @Description: TODO
 * @className: JhonyuDaoException
 * @userName: jiangyu
 * @date: 2016年2月18日 下午1:01:31
 */
public class JhonyuDaoException extends JhonyuSysException
{
    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = 1L;

    /**
     * Modified by jiangyu
     * 
     * @Description strs代表的是可替换的值 例如：异常信息可以定义为：从一个{0}状态调整到{1}状态出现异常 ,strs中按顺序对应的值分别会替换{0}，{1}中的信息
     * @auther jiangyu
     * @param errorCode 异常码
     * @param strs 异常信息中占位符对应的值
     */
    public JhonyuDaoException(String errorCode, Object... strs)
    {
        super(errorCode, strs);
    }
}
