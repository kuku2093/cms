package com.factory.cms.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import com.factory.cms.exception.MessageEnum;
import com.factory.cms.exception.SysException;

public class Producer {

	/**
	 * 消息生产者
	 */
	// 发布订阅、多对多的方式
	// 网页消息队列消息查询地址http://127.0.0.1:8161/admin
	// 登入帐号：admin，密码：admin
	private static final String username = ActiveMQConnection.DEFAULT_USER;// 默认的连接用户名
	private static final String password = ActiveMQConnection.DEFAULT_PASSWORD;// 默认连接密码
	private static final String brokerURL = ActiveMQConnection.DEFAULT_BROKER_URL; // 默认的连接地址
	private static final int sendnum = 10;// 发送的消息数量

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionFactory connectionFactory; // 连接工厂
		Connection connection = null; // 连接
		Session session; // 会话 接受或者发送消息的线程
		Destination destination; // 消息的目的地
		MessageProducer messageProducer;// 消息生产者

		connectionFactory = new ActiveMQConnectionFactory(
				Producer.username, Producer.password,
				Producer.brokerURL);// 实例化连接工厂
		try {
			connection = connectionFactory.createConnection(); // 通过连接工厂获取连接
			connection.start(); // 启动连接
			session = connection.createSession(Boolean.TRUE,
					Session.AUTO_ACKNOWLEDGE); // 创建Session
			// destination = session.createQueue("111"); // 创建消息队列
			destination = session.createTopic("kzkt topic"); // 消息发布者
			messageProducer = session.createProducer(destination);// 创建消息生产者
			sendMessage(session, messageProducer); // 发送消息
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new SysException(MessageEnum.BASE_ERROR);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		}
	}
	// 发送消息
	@SuppressWarnings("unused")
	private static void sendMessage(Session session,
			MessageProducer messageProducer) throws Exception {
		for (int i = 0; i < Producer.sendnum; i++) {
			TextMessage createTextMessage = session
					.createTextMessage("发送的消息" + i);
			System.out.println("发送消息：" + "发布的消息" + i);
			messageProducer.send(createTextMessage);
		}
	}
}
