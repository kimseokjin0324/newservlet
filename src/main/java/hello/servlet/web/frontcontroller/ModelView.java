package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

//참고로 ModelView 객체는 다른 버전에서도 사용하므로 패키지를 frontcontroller 에 둔다
public class ModelView {

    private String viewName;
    private Map<String,Object> model=new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
