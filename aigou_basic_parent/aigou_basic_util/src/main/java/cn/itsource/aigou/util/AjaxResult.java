package cn.itsource.aigou.util;

/**
 * @author 苏波
 */
public class AjaxResult {
    private Boolean success = true;
    private String msg = "操作成功";
    /**
     * 如果还有其他的值返回到前台 就保存在这个字段
     */
    private Object object = null;

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }
}
