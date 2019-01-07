package com.mengze.databinding;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/*
用BeanWrapper set或者get bean的属性
 */
public class DatabindingWithBeanWrapper {

    public static void main(String[] args) {
        BeanWrapper company = new BeanWrapperImpl(new Company());
        company.setPropertyValue("name", "mengze inc");
//        PropertyValue pv = new PropertyValue("name", "mengze inc");
//        company.setPropertyValue(pv);
        BeanWrapper wjh = new BeanWrapperImpl(new Employee());
        wjh.setPropertyValue("name", "wu jiang hao");
        company.setPropertyValue("employee", wjh.getWrappedInstance());
        System.out.println(company.getPropertyValue("employee.salary"));
    }
}
