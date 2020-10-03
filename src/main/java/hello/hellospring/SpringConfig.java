package hello.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;

@Configuration
public class SpringConfig {

	//	private final DataSource dataSource;
////	@PersistenceContext
//	private final EntityManager em;
	private final MemberRepository memberRepository;

//	@Autowired
//	public SpringConfig(DataSource dataSource, EntityManager em) {
//		this.dataSource = dataSource;
//		this.em = em;
//	}

	// spring data jpa config add
//	@Autowired  // 생성자 하나인 경우 생략 가능
	public SpringConfig(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Bean
	public MemberService memberService() {
//		return new MemberService(memberRepository());
		return new MemberService(memberRepository);
	}

//	@Bean
//	public TimeTraceAop timeTraceAop() {
//		return new TimeTraceAop();
//	}

//	@Bean
//	public MemberRepository memberRepository() {
////		return new MemoryMemberRepository();
////		return new JdbcMemberRepository(dataSource);
////		return new JdbcTemplateMemberRepository(dataSource);
////		return new JpaMemberRepository(em);
//	}
}
