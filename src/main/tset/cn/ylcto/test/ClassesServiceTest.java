package cn.ylcto.test;

import cn.ylcto.student.service.IClassesService;
import cn.ylcto.student.vo.Classes;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by sewef on 2017/8/13.
 */
public class ClassesServiceTest {

    private static ApplicationContext ctx;
    private static IClassesService classesService;

    static {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        classesService = ctx.getBean("classesServiceImpl",IClassesService.class);
    }
    @Test
    public void insert() throws Exception {
        Classes classes = new Classes();
        classes.setCid(1001);
        classes.setCname("国务");
        classes.setNote("下雪的");
        TestCase.assertTrue(this.classesService.insert(classes));
    }
}
