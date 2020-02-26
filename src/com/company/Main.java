/**
 *
Shift + End 选中光标到当前行尾位置
Shift + Home 选中光标到当前行头位置
Shift + Tab 取消缩进 （必备）
Shift + Enter 开始新一行。光标所在行下空出一行，光标定位到新行位置 （必备）
Ctrl + D 复制光标所在行 或 复制选择内容，并把复制内容插入光标位置下面 （必备）
Shift + F7 在 Debug 模式下，智能步入。断点所在行上有多个方法调用，会弹出进入哪个方法
Alt + 前方向键 当前光标跳转到当前文件的前一个方法名位置 （必备）
Alt + 后方向键 当前光标跳转到当前文件的后一个方法名位置 （必备）
Alt + 上下 切换当前java文件

Alt + Enter IntelliJ IDEA 根据光标所在问题，提供快速修复选择，光标放在的位置不同提示的结果也不同 （必备）
Ctrl + Shift + Z 取消撤销 （必备）
Ctrl + Shift + F7 高亮显示所有该选中文本，按 Esc 高亮消失 （必备）
F7 在 Debug 模式下，进入下一步，如果当前行断点是一个方法，则进入当前方法体内，如果该方法体还有方法，则不会进入该内嵌的方法中
F8 在 Debug 模式下，进入下一步，如果当前行断点是一个方法，则不进入当前方法体内
F9 在 Debug 模式下，恢复程序运行，但是如果该断点下面代码还有断点则停在下一个断点上
F2 跳转到下一个高亮错误 或 警告位置 （必备）
F3 在查找模式下，定位到下一个匹配处
Ctrl + Y 删除光标所在行 或 删除选中的行 （必备）
Ctrl + X 剪切光标所在行 或 剪切选择内容
Ctrl + U 前往当前光标所在的方法的父类的方法 / 接口定义 （必备）
Ctrl + B 进入光标所在的方法/变量的接口或是定义处，等效于 Ctrl + 左键单击 （必备）
Ctrl + + 展开代码
Ctrl + - 折叠代码
Ctrl + Tab 编辑窗口切换，如果在切换的过程又加按上 delete，则是关闭对应选中的窗口
Ctrl + [ 移动光标到当前所在代码的花括号开始位置
Ctrl + ] 移动光标到当前所在代码的花括号结束位
Ctrl + Shift + [ 选中从光标所在位置到它的顶部中括号位置 （必备）
Ctrl + Shift + ] 选中从光标所在位置到它的底部中括号位置 （必备）
Ctrl + End 跳到文件尾
Ctrl + Home 跳到文件头
Alt + / 基础代码补全
lt + 左方向键 切换当前已打开的窗口中的子视图，比如 Debug 窗口中有 Output、Debugger 等子视图，用此快捷键就可以在子视图中切换 （必备）
Ctrl + F8 在 Debug 模式下，设置光标当前行为断点，如果当前已经是断点则去掉断点
Ctrl + Shift + H 显示方法层次结构
Ctrl + Shift + Space 智能代码提示
修改局部变量为成员变量快捷键
抽取一段代码为一个方法
添加到收藏
查看某个方法的多层重写结构
打开最近修改的文件
关闭当前打开的代码栏
选择要粘贴的内容，一般按了多次ctrl+c后，按ctrl+shift+v会出现曾经按过复制键的全部行
在方法上按快捷键，可以查找方法在哪里被调用
输入方法名字，直接查找到方法位置
 */
package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("helloworld");
        Date date = new Date();
        ArrayList list =new ArrayList();

        System.out.println(date);
    }
}
