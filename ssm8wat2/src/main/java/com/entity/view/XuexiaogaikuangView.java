package com.entity.view;

import com.entity.XuexiaogaikuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学校概况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:46
 */
@TableName("xuexiaogaikuang")
public class XuexiaogaikuangView  extends XuexiaogaikuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexiaogaikuangView(){
	}
 
 	public XuexiaogaikuangView(XuexiaogaikuangEntity xuexiaogaikuangEntity){
 	try {
			BeanUtils.copyProperties(this, xuexiaogaikuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
