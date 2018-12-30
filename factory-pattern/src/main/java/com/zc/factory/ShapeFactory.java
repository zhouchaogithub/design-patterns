package com.zc.factory;

import com.zc.Shap;
import com.zc.impl.Circle;
import com.zc.impl.Rectangle;
import com.zc.impl.Square;



public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shap getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return  new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
