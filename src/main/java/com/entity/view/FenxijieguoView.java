package com.entity.view;

import com.entity.FenxijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 分析结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 22:27:08
 */
@TableName("fenxijieguo")
public class FenxijieguoView  extends FenxijieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FenxijieguoView(){
	}
 
 	public FenxijieguoView(FenxijieguoEntity fenxijieguoEntity){
 	try {
			BeanUtils.copyProperties(this, fenxijieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}