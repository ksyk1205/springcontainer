package kr.co.itcen.springcontatiner.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;
import kr.co.itcen.springcontainer.user.Friend;
import kr.co.itcen.springcontainer.user.User;

@RunWith(SpringJUnit4ClassRunner.class) //순서대로 실행되지 않음 병렬로 테스트하게끔 만드는게 제일 좋음.
@ContextConfiguration(classes = {UserConfig01.class})
public class UserTest {
	
	@Autowired
	private User user;
	
	@Autowired
	private Friend friend;

	@Test
	public void testUserNull() {
//		assert(user!=null);
		assertNotNull(user);
		
	}
	
	@Test
	public void testFriendNull() {
		assertNotNull(friend);
		
	}
	
	@Test
	public void testFriendDooly() {
		assertEquals(friend.getName(), "둘리");
		
	}
	
//	@Test
//	public void testMethod() {
//		int x = 8;
//		assert(x-2==6);
//	}
}
