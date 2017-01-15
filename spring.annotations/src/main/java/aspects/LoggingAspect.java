package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import model.Triangle;

@Aspect
public class LoggingAspect {

	public LoggingAspect() {
		// TODO Auto-generated constructor stub
	}

	@Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.println("Advice run...");
	}

	@Before("execution(public String model.Circle.getName())")
	public void LoggingAdviceSpecific() {
		System.out.println("Advice run Specific...");
	}

	// any get method, which return any type, any with 0 or more params
	@Before("allGetters()")
	public void LoggingAdviceNotSpecific() {
		System.out.println("Advice run *...");
	}

	@Pointcut("execution(public * get*(..))")
	public void allGetters() {
	}

	@Pointcut("within(model.Triangle)")
	public void allTriangleMethods() {
	}

	@AfterReturning(pointcut = "allTriangleMethods()", returning = "returnObject")
	public void sayTriangleHelo(JoinPoint joinPoint, String returnObject) {
		Triangle triangle = (Triangle) joinPoint.getTarget();
		System.out.println("After Triagle Method - " + triangle);
		System.out.println(joinPoint.getSignature());
		System.out.println("Return Object is - " + returnObject);

	}

	// @AfterThrowing(pointcut="execution(public void
	// throwExample())",throwing="ex")
	// public void exceptinAdvice(String name,Exception ex){
	// System.out.println("Exception has been thrown - " + name);
	//
	// }

	@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("in setter, the argumaent is - " + name);
	}

	@Around("execution(public String model.Triangle.runMe())")
	public String aroundTriangle(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Around before...");
		String result = null;
		try {
			if (true) {
				result = (String)proceedingJoinPoint.proceed();
				System.out.println("Around after...");
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	 @Before("@annotation(annotations.Loggable)")
	 public void beforeAnnotation(){
		 System.out.println("Before Annotation...");
	 }
}
