package com.lzs.thread.waitandnotify;

public class Info {

	private String name = "name";
	private String content = "content";
	private boolean flag = true; // flag为false，生产，true等待消费者通知,初试为生产

	public synchronized void set(String name, String content) {
		while (!flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.setName(name);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setContent(content);
		flag = false;
		super.notify();
	}

	public synchronized void get() {
		while (flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(this.name + "--->" + this.content);
		flag = true;
		super.notify();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
