package com.insi.da.wscommon.base;

/**
 * @program: hd
 * @description: 错误CODE和MSG
 * @author: XuChao
 * @create: 2019-12-24 14:57
 **/
public class CodeMsg {

    private int retCode;
    private String message;

    // 按照模块定义CodeMsg
    // 通用异常
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_EXCEPTION = new CodeMsg(500100, "服务端异常");
    public static CodeMsg PARAMETER_ISNULL = new CodeMsg(500101, "输入参数为空");
    public static CodeMsg PERMISSION_ERROR = new CodeMsg(500102, "你没有权限访问");

    // 业务异常
    public static CodeMsg USER_NOT_EXSIST = new CodeMsg(500103, "用户不存在");
    public static CodeMsg ONLINE_USER_OVER = new CodeMsg(500104, "在线用户数超出允许登录的最大用户限制。");
    public static CodeMsg SESSION_NOT_EXSIST = new CodeMsg(500105, "不存在离线session数据");
    public static CodeMsg NOT_FIND_DATA = new CodeMsg(500106, "查找不到对应数据");
    public static CodeMsg USER_PASS_ERROR = new CodeMsg(500107, "密码错误!");
    public static CodeMsg DATA_INSERT_ERROR = new CodeMsg(500108, "数据添加失败");
    public static CodeMsg DATA_DELETE_ERROR = new CodeMsg(500109, "数据删除失败");
    public static CodeMsg DATA_UPDATE_ERROR = new CodeMsg(500110, "数据更新失败");
    public static CodeMsg DIC_CODE_REPEAT = new CodeMsg(500111, "数据字典编码不能重复");
    public static CodeMsg DIC_DELETE_ERROR = new CodeMsg(500112, "该数据字典有子数据，无法删除");

    private CodeMsg(int retCode, String message) {
        this.retCode = retCode;
        this.message = message;
    }

    public int getRetCode() {
        return retCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
