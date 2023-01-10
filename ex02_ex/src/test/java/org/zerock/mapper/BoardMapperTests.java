package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("newbie");
//		
//		mapper.insert(board);
//		//BoardMapper 인터페이스 클래스의 insert() 메소드 호출 -> BoardMapper.xml 파일의 sql 구문 실행
//		
//		log.info(board);
//		//결과 값이 console에서 bno=null로 찍힘 -> pk 값을 알 수 없다.
//	}
	
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글2");
//		board.setContent("새로 작성하는 내용2");
//		board.setWriter("newbie2");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//		//결과값이 console에서 bno=8로 찍힘 -> pk 값을 알 수 있다.
//	}
	
//	@Test
//	public void testRead() {
//		BoardVO board = mapper.read(5L);
//		
//		log.info(board);
//	}
}
