package com.glqdlt.ex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @see <a href ='https://corochann.com/javadoc-coding-rule-of-link-linkplain-see-372.html'>basic usefle</a>
 * @author glqdlt
 * @version 1.0.0
 * 별 거 없는, 기본적인 어플리케이션 시작점
 */
@SpringBootApplication
public class GenerateJavaDocApplication implements CommandLineRunner{

	/**
	 * @see SomeEnum
	 * 그냥 단순한 Enum
	 */
	private final SomeEnum someEnum = SomeEnum.FIELD1;
	/**
	 *
	 * @param args 어플리케이션이 실행될 때 추가적으로 들어오는 커맨드들을 인자로 받아들임.
	 */
	public static void main(String[] args) {
		SpringApplication.run(GenerateJavaDocApplication.class, args);
	}

	/**
	 * {@link SomeEnum}
	 *
	 * 인터페이스는 {@link org.springframework.boot.CommandLineRunner} 를 구현했다.
	 *
	 * @param strings 아규먼트들..
	 * @throws Exception
	 * 그냥 간단히 {@link SomeEnum} 을 찍어준다.
	 */
	@Override
	public void run(String... strings) throws Exception {
		System.out.println(someEnum.name());
	}
}

