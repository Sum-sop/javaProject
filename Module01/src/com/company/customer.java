package com.company;

import java.util.ArrayList;

/**
 * 代码模板所在位置
 * edit->live templates可以修改自定义
 * edit->general->postfix completion不能修改
 *
 * 1.psvm:main方法快捷键
 * sout：输出快捷键
 * soutm：方法名称
 * soutp：参数（形参）
 * soutv:就近变量
 * num1.sout
 * 2.fori:for循环快捷键
 * iter:生成增强for循环
 * itar：生成普通for循环
 *
 * 3.list.for:list循环
 * for (Object o : list) {}
 * list.fori：list的i循环
 * for (int i = 0; i < list.size(); i++) {  }
 * list.forr:list的逆序便利
 * for (int i = list.size() - 1; i >= 0; i--) {}
 * 4.
 * Ifn：if (list == null) {}
 * inn:if (list != null) {}////xx.nn    xx.null
 * 5.
 * prsf:private static final
 * psf:private static final
 * psfi:public static final int
 * psfs:public static final String
 *
 *
 * ctrl+j:查找其他快捷输入
 * Ctrl + Shift + Space 智能代码提示
 */
public class customer {

    private static final customer cust = new customer();
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(234);
        list.add(345);
        System.out.println();
    }
}