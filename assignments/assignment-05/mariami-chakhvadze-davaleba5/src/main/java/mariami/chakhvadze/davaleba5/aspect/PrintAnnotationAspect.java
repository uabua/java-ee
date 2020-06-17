package mariami.chakhvadze.davaleba5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class PrintAnnotationAspect {
    @Before("@annotation(mariami.chakhvadze.davaleba5.aspect.Println)")
    public void printAnnotationAspectAdvice(JoinPoint joinPoint) {
        System.out.println("გადაცემული არგუმენტები" + Arrays.toString(joinPoint.getArgs()));
    }
}
