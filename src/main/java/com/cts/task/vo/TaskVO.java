package com.cts.task.vo;

import java.util.Date;

public class TaskVO {
	
	private int task_id;
	private String taskName;
	private int parent_task_id;
	private Date start_date;
	private Date end_date;
	private int priority;
	private String activeFlag;
	
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	
	public int getParent_task_id() {
		return parent_task_id;
	}
	public void setParent_task_id(int parent_task_id) {
		this.parent_task_id = parent_task_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	
}
