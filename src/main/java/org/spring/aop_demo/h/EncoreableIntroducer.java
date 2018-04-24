package org.spring.aop_demo.h;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 将Encoreable接口引入到Performance bean中
 */
@Aspect
public class EncoreableIntroducer {

	@DeclareParents(//
			value = "org.spring.aop_demo.h.Performance+"// 指定那种类型的bean要引入接口，后面的+表示Performance的所有子类型
			, defaultImpl = DefaultEncoreable.class//
	)
	public static Encoreable encoreable; // 静态属性指明要引入的接口

}
