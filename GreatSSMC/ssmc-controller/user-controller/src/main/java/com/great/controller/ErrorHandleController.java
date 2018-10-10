package com.great.controller;

import com.great.constants.ErrorConstant;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZhPJ
 * @Date 2018/10/9 000917:43
 * @Version 1.0
 * @Description: 处理错误异常和错误页面信息，可以使用继承AbstractErrorController 进行继承，
 *                 继承后在构造函数中进行配置
 *                 在覆盖getErrorPath方法，在springboot中默认的错误访问路径是/error
 */
@Controller
public class ErrorHandleController extends AbstractErrorController {

    /**
     * @deprecated: 赋给父类的默认错误参数
     */
    public ErrorHandleController() {
        super(new DefaultErrorAttributes());
    }

    /**
     * @deprecated: 错误页面路径
     * @return: 错误页面
     */
    @RequestMapping(value = ErrorConstant.ERROR_PAGE)
    @Override
    public String getErrorPath() {
        return "/error";
    }
}
