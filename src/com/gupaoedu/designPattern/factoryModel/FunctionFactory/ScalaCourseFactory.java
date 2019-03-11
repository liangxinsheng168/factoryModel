package com.gupaoedu.designPattern.factoryModel.FunctionFactory;

import com.gupaoedu.designPattern.factoryModel.Course;
import com.gupaoedu.designPattern.factoryModel.ScalaCourse;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class ScalaCourseFactory implements FunctionFactory {

    @Override
    public Course createCourse() {

        return new ScalaCourse();

    }

}
